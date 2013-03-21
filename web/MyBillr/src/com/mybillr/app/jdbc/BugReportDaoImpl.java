/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.app.jdbc;

import com.mybillr.app.dao.*;
import com.mybillr.app.factory.*;
import java.util.Date;
import com.mybillr.app.dto.*;
import com.mybillr.app.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class BugReportDaoImpl extends AbstractDAO implements BugReportDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT id, title, user_id, message, reported_on FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, title, user_id, message, reported_on ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, title = ?, user_id = ?, message = ?, reported_on = ? WHERE id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column title
	 */
	protected static final int COLUMN_TITLE = 2;

	/** 
	 * Index of column user_id
	 */
	protected static final int COLUMN_USER_ID = 3;

	/** 
	 * Index of column message
	 */
	protected static final int COLUMN_MESSAGE = 4;

	/** 
	 * Index of column reported_on
	 */
	protected static final int COLUMN_REPORTED_ON = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Inserts a new row in the bug_report table.
	 */
	public BugReportPk insert(BugReport dto) throws BugReportDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTitleModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "title" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUserIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "user_id" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMessageModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "message" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isReportedOnModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "reported_on" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdModified()) {
				stmt.setInt( index++, dto.getId() );
			}
		
			if (dto.isTitleModified()) {
				stmt.setString( index++, dto.getTitle() );
			}
		
			if (dto.isUserIdModified()) {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isMessageModified()) {
				stmt.setString( index++, dto.getMessage() );
			}
		
			if (dto.isReportedOnModified()) {
				stmt.setTimestamp(index++, dto.getReportedOn()==null ? null : new java.sql.Timestamp( dto.getReportedOn().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setId( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BugReportDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the bug_report table.
	 */
	public void update(BugReportPk pk, BugReport dto) throws BugReportDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id=?" );
				modified=true;
			}
		
			if (dto.isTitleModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "title=?" );
				modified=true;
			}
		
			if (dto.isUserIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "user_id=?" );
				modified=true;
			}
		
			if (dto.isMessageModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "message=?" );
				modified=true;
			}
		
			if (dto.isReportedOnModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "reported_on=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdModified()) {
				stmt.setInt( index++, dto.getId() );
			}
		
			if (dto.isTitleModified()) {
				stmt.setString( index++, dto.getTitle() );
			}
		
			if (dto.isUserIdModified()) {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isMessageModified()) {
				stmt.setString( index++, dto.getMessage() );
			}
		
			if (dto.isReportedOnModified()) {
				stmt.setTimestamp(index++, dto.getReportedOn()==null ? null : new java.sql.Timestamp( dto.getReportedOn().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BugReportDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the bug_report table.
	 */
	public void delete(BugReportPk pk) throws BugReportDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BugReportDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the bug_report table that matches the specified primary-key value.
	 */
	public BugReport findByPrimaryKey(BugReportPk pk) throws BugReportDaoException
	{
		return findByPrimaryKey( pk.getId() );
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria 'id = :id'.
	 */
	public BugReport findByPrimaryKey(int id) throws BugReportDaoException
	{
		BugReport ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ?", new Object[] {  new Integer(id) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria ''.
	 */
	public BugReport[] findAll() throws BugReportDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id", null );
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria 'user_id = :userId'.
	 */
	public BugReport[] findByUser(int userId) throws BugReportDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ?", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria 'id = :id'.
	 */
	public BugReport[] findWhereIdEquals(int id) throws BugReportDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria 'title = :title'.
	 */
	public BugReport[] findWhereTitleEquals(String title) throws BugReportDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE title = ? ORDER BY title", new Object[] { title } );
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria 'user_id = :userId'.
	 */
	public BugReport[] findWhereUserIdEquals(int userId) throws BugReportDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? ORDER BY user_id", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria 'message = :message'.
	 */
	public BugReport[] findWhereMessageEquals(String message) throws BugReportDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE message = ? ORDER BY message", new Object[] { message } );
	}

	/** 
	 * Returns all rows from the bug_report table that match the criteria 'reported_on = :reportedOn'.
	 */
	public BugReport[] findWhereReportedOnEquals(Date reportedOn) throws BugReportDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE reported_on = ? ORDER BY reported_on", new Object[] { reportedOn==null ? null : new java.sql.Timestamp( reportedOn.getTime() ) } );
	}

	/**
	 * Method 'BugReportDaoImpl'
	 * 
	 */
	public BugReportDaoImpl()
	{
	}

	/**
	 * Method 'BugReportDaoImpl'
	 * 
	 * @param userConn
	 */
	public BugReportDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "bug_report";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected BugReport fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			BugReport dto = new BugReport();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected BugReport[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			BugReport dto = new BugReport();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		BugReport ret[] = new BugReport[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(BugReport dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setTitle( rs.getString( COLUMN_TITLE ) );
		dto.setUserId( rs.getInt( COLUMN_USER_ID ) );
		dto.setMessage( rs.getString( COLUMN_MESSAGE ) );
		dto.setReportedOn( rs.getTimestamp(COLUMN_REPORTED_ON ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(BugReport dto)
	{
		dto.setIdModified( false );
		dto.setTitleModified( false );
		dto.setUserIdModified( false );
		dto.setMessageModified( false );
		dto.setReportedOnModified( false );
	}

	/** 
	 * Returns all rows from the bug_report table that match the specified arbitrary SQL statement
	 */
	public BugReport[] findByDynamicSelect(String sql, Object[] sqlParams) throws BugReportDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BugReportDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the bug_report table that match the specified arbitrary SQL statement
	 */
	public BugReport[] findByDynamicWhere(String sql, Object[] sqlParams) throws BugReportDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BugReportDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}

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

public class GroupsDaoImpl extends AbstractDAO implements GroupsDao
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
	protected final String SQL_SELECT = "SELECT id, name, member_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, name, member_id ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, name = ?, member_id = ? WHERE id = ? AND name = ? AND member_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ? AND name = ? AND member_id = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column member_id
	 */
	protected static final int COLUMN_MEMBER_ID = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Index of primary-key column name
	 */
	protected static final int PK_COLUMN_NAME = 2;

	/** 
	 * Index of primary-key column member_id
	 */
	protected static final int PK_COLUMN_MEMBER_ID = 3;

	/** 
	 * Inserts a new row in the groups table.
	 */
	public GroupsPk insert(Groups dto) throws GroupsDaoException
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
		
			if (dto.isNameModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "name" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMemberIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "member_id" );
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
		
			if (dto.isNameModified()) {
				stmt.setString( index++, dto.getName() );
			}
		
			if (dto.isMemberIdModified()) {
				stmt.setInt( index++, dto.getMemberId() );
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
			throw new GroupsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the groups table.
	 */
	public void update(GroupsPk pk, Groups dto) throws GroupsDaoException
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
		
			if (dto.isNameModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "name=?" );
				modified=true;
			}
		
			if (dto.isMemberIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "member_id=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id=? AND name=? AND member_id=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdModified()) {
				stmt.setInt( index++, dto.getId() );
			}
		
			if (dto.isNameModified()) {
				stmt.setString( index++, dto.getName() );
			}
		
			if (dto.isMemberIdModified()) {
				stmt.setInt( index++, dto.getMemberId() );
			}
		
			stmt.setInt( index++, pk.getId() );
			stmt.setString( index++, pk.getName() );
			stmt.setInt( index++, pk.getMemberId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GroupsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the groups table.
	 */
	public void delete(GroupsPk pk) throws GroupsDaoException
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
			stmt.setString( 2, pk.getName() );
			stmt.setInt( 3, pk.getMemberId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GroupsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the groups table that matches the specified primary-key value.
	 */
	public Groups findByPrimaryKey(GroupsPk pk) throws GroupsDaoException
	{
		return findByPrimaryKey( pk.getId(), pk.getName(), pk.getMemberId() );
	}

	/** 
	 * Returns all rows from the groups table that match the criteria 'id = :id AND name = :name AND member_id = :memberId'.
	 */
	public Groups findByPrimaryKey(int id, String name, int memberId) throws GroupsDaoException
	{
		Groups ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ? AND name = ? AND member_id = ?", new Object[] {  new Integer(id), name,  new Integer(memberId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the groups table that match the criteria ''.
	 */
	public Groups[] findAll() throws GroupsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id, name, member_id", null );
	}

	/** 
	 * Returns all rows from the groups table that match the criteria 'member_id = :memberId'.
	 */
	public Groups[] findByUser(int memberId) throws GroupsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE member_id = ?", new Object[] {  new Integer(memberId) } );
	}

	/** 
	 * Returns all rows from the groups table that match the criteria 'id = :id'.
	 */
	public Groups[] findWhereIdEquals(int id) throws GroupsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the groups table that match the criteria 'name = :name'.
	 */
	public Groups[] findWhereNameEquals(String name) throws GroupsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the groups table that match the criteria 'member_id = :memberId'.
	 */
	public Groups[] findWhereMemberIdEquals(int memberId) throws GroupsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE member_id = ? ORDER BY member_id", new Object[] {  new Integer(memberId) } );
	}

	/**
	 * Method 'GroupsDaoImpl'
	 * 
	 */
	public GroupsDaoImpl()
	{
	}

	/**
	 * Method 'GroupsDaoImpl'
	 * 
	 * @param userConn
	 */
	public GroupsDaoImpl(final java.sql.Connection userConn)
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
		return "groups";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Groups fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Groups dto = new Groups();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Groups[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Groups dto = new Groups();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Groups ret[] = new Groups[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Groups dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setMemberId( rs.getInt( COLUMN_MEMBER_ID ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Groups dto)
	{
		dto.setIdModified( false );
		dto.setNameModified( false );
		dto.setMemberIdModified( false );
	}

	/** 
	 * Returns all rows from the groups table that match the specified arbitrary SQL statement
	 */
	public Groups[] findByDynamicSelect(String sql, Object[] sqlParams) throws GroupsDaoException
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
			throw new GroupsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the groups table that match the specified arbitrary SQL statement
	 */
	public Groups[] findByDynamicWhere(String sql, Object[] sqlParams) throws GroupsDaoException
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
			throw new GroupsDaoException( "Exception: " + _e.getMessage(), _e );
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
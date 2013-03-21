/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.jdbc;

import com.mybillr.db.dao.*;
import com.mybillr.db.factory.*;
import com.mybillr.db.dto.*;
import com.mybillr.db.exceptions.*;
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

public class FriendsDaoImpl extends AbstractDAO implements FriendsDao
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
	protected final String SQL_SELECT = "SELECT user_id, friends_with FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( user_id, friends_with ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET user_id = ?, friends_with = ? WHERE user_id = ? AND friends_with = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE user_id = ? AND friends_with = ?";

	/** 
	 * Index of column user_id
	 */
	protected static final int COLUMN_USER_ID = 1;

	/** 
	 * Index of column friends_with
	 */
	protected static final int COLUMN_FRIENDS_WITH = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column user_id
	 */
	protected static final int PK_COLUMN_USER_ID = 1;

	/** 
	 * Index of primary-key column friends_with
	 */
	protected static final int PK_COLUMN_FRIENDS_WITH = 2;

	/** 
	 * Inserts a new row in the friends table.
	 */
	public FriendsPk insert(Friends dto) throws FriendsDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getUserId() );
			stmt.setInt( index++, dto.getFriendsWith() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FriendsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the friends table.
	 */
	public void update(FriendsPk pk, Friends dto) throws FriendsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getUserId() );
			stmt.setInt( index++, dto.getFriendsWith() );
			stmt.setInt( 3, pk.getUserId() );
			stmt.setInt( 4, pk.getFriendsWith() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FriendsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the friends table.
	 */
	public void delete(FriendsPk pk) throws FriendsDaoException
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
			stmt.setInt( 1, pk.getUserId() );
			stmt.setInt( 2, pk.getFriendsWith() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FriendsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the friends table that matches the specified primary-key value.
	 */
	public Friends findByPrimaryKey(FriendsPk pk) throws FriendsDaoException
	{
		return findByPrimaryKey( pk.getUserId(), pk.getFriendsWith() );
	}

	/** 
	 * Returns all rows from the friends table that match the criteria 'user_id = :userId AND friends_with = :friendsWith'.
	 */
	public Friends findByPrimaryKey(int userId, int friendsWith) throws FriendsDaoException
	{
		Friends ret[] = findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? AND friends_with = ?", new Object[] {  new Integer(userId),  new Integer(friendsWith) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the friends table that match the criteria ''.
	 */
	public Friends[] findAll() throws FriendsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY user_id, friends_with", null );
	}

	/** 
	 * Returns all rows from the friends table that match the criteria 'user_id = :userId'.
	 */
	public Friends[] findByUser(int userId) throws FriendsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ?", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the friends table that match the criteria 'friends_with = :friendsWith'.
	 */
	public Friends[] findByUser2(int friendsWith) throws FriendsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE friends_with = ?", new Object[] {  new Integer(friendsWith) } );
	}

	/** 
	 * Returns all rows from the friends table that match the criteria 'user_id = :userId'.
	 */
	public Friends[] findWhereUserIdEquals(int userId) throws FriendsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? ORDER BY user_id", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the friends table that match the criteria 'friends_with = :friendsWith'.
	 */
	public Friends[] findWhereFriendsWithEquals(int friendsWith) throws FriendsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE friends_with = ? ORDER BY friends_with", new Object[] {  new Integer(friendsWith) } );
	}

	/**
	 * Method 'FriendsDaoImpl'
	 * 
	 */
	public FriendsDaoImpl()
	{
	}

	/**
	 * Method 'FriendsDaoImpl'
	 * 
	 * @param userConn
	 */
	public FriendsDaoImpl(final java.sql.Connection userConn)
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
		return "friends";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Friends fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Friends dto = new Friends();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Friends[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Friends dto = new Friends();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Friends ret[] = new Friends[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Friends dto, ResultSet rs) throws SQLException
	{
		dto.setUserId( rs.getInt( COLUMN_USER_ID ) );
		dto.setFriendsWith( rs.getInt( COLUMN_FRIENDS_WITH ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Friends dto)
	{
	}

	/** 
	 * Returns all rows from the friends table that match the specified arbitrary SQL statement
	 */
	public Friends[] findByDynamicSelect(String sql, Object[] sqlParams) throws FriendsDaoException
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
			throw new FriendsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the friends table that match the specified arbitrary SQL statement
	 */
	public Friends[] findByDynamicWhere(String sql, Object[] sqlParams) throws FriendsDaoException
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
			throw new FriendsDaoException( "Exception: " + _e.getMessage(), _e );
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
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

public class ItemShareDaoImpl extends AbstractDAO implements ItemShareDao
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
	protected final String SQL_SELECT = "SELECT id, item_id, user_id, share FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, item_id, user_id, share ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, item_id = ?, user_id = ?, share = ? WHERE id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column item_id
	 */
	protected static final int COLUMN_ITEM_ID = 2;

	/** 
	 * Index of column user_id
	 */
	protected static final int COLUMN_USER_ID = 3;

	/** 
	 * Index of column share
	 */
	protected static final int COLUMN_SHARE = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Inserts a new row in the item_share table.
	 */
	public ItemSharePk insert(ItemShare dto) throws ItemShareDaoException
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
		
			if (dto.isItemIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "item_id" );
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
		
			if (dto.isShareModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "share" );
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
		
			if (dto.isItemIdModified()) {
				stmt.setInt( index++, dto.getItemId() );
			}
		
			if (dto.isUserIdModified()) {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isShareModified()) {
				stmt.setInt( index++, dto.getShare() );
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
			throw new ItemShareDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the item_share table.
	 */
	public void update(ItemSharePk pk, ItemShare dto) throws ItemShareDaoException
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
		
			if (dto.isItemIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "item_id=?" );
				modified=true;
			}
		
			if (dto.isUserIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "user_id=?" );
				modified=true;
			}
		
			if (dto.isShareModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "share=?" );
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
		
			if (dto.isItemIdModified()) {
				stmt.setInt( index++, dto.getItemId() );
			}
		
			if (dto.isUserIdModified()) {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isShareModified()) {
				stmt.setInt( index++, dto.getShare() );
			}
		
			stmt.setInt( index++, pk.getId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemShareDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the item_share table.
	 */
	public void delete(ItemSharePk pk) throws ItemShareDaoException
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
			throw new ItemShareDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the item_share table that matches the specified primary-key value.
	 */
	public ItemShare findByPrimaryKey(ItemSharePk pk) throws ItemShareDaoException
	{
		return findByPrimaryKey( pk.getId() );
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria 'id = :id'.
	 */
	public ItemShare findByPrimaryKey(int id) throws ItemShareDaoException
	{
		ItemShare ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ?", new Object[] {  new Integer(id) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria ''.
	 */
	public ItemShare[] findAll() throws ItemShareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id", null );
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria 'item_id = :itemId'.
	 */
	public ItemShare[] findByItems(int itemId) throws ItemShareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE item_id = ?", new Object[] {  new Integer(itemId) } );
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria 'user_id = :userId'.
	 */
	public ItemShare[] findByUser(int userId) throws ItemShareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ?", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria 'id = :id'.
	 */
	public ItemShare[] findWhereIdEquals(int id) throws ItemShareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria 'item_id = :itemId'.
	 */
	public ItemShare[] findWhereItemIdEquals(int itemId) throws ItemShareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE item_id = ? ORDER BY item_id", new Object[] {  new Integer(itemId) } );
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria 'user_id = :userId'.
	 */
	public ItemShare[] findWhereUserIdEquals(int userId) throws ItemShareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? ORDER BY user_id", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the item_share table that match the criteria 'share = :share'.
	 */
	public ItemShare[] findWhereShareEquals(int share) throws ItemShareDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE share = ? ORDER BY share", new Object[] {  new Integer(share) } );
	}

	/**
	 * Method 'ItemShareDaoImpl'
	 * 
	 */
	public ItemShareDaoImpl()
	{
	}

	/**
	 * Method 'ItemShareDaoImpl'
	 * 
	 * @param userConn
	 */
	public ItemShareDaoImpl(final java.sql.Connection userConn)
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
		return "item_share";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ItemShare fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ItemShare dto = new ItemShare();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ItemShare[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ItemShare dto = new ItemShare();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ItemShare ret[] = new ItemShare[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ItemShare dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setItemId( rs.getInt( COLUMN_ITEM_ID ) );
		dto.setUserId( rs.getInt( COLUMN_USER_ID ) );
		dto.setShare( rs.getInt( COLUMN_SHARE ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ItemShare dto)
	{
		dto.setIdModified( false );
		dto.setItemIdModified( false );
		dto.setUserIdModified( false );
		dto.setShareModified( false );
	}

	/** 
	 * Returns all rows from the item_share table that match the specified arbitrary SQL statement
	 */
	public ItemShare[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemShareDaoException
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
			throw new ItemShareDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the item_share table that match the specified arbitrary SQL statement
	 */
	public ItemShare[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemShareDaoException
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
			throw new ItemShareDaoException( "Exception: " + _e.getMessage(), _e );
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
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

public class UserDaoImpl extends AbstractDAO implements UserDao
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
	protected final String SQL_SELECT = "SELECT id, email, salt, password, active FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, email, salt, password, active ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, email = ?, salt = ?, password = ?, active = ? WHERE id = ? AND email = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ? AND email = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column email
	 */
	protected static final int COLUMN_EMAIL = 2;

	/** 
	 * Index of column salt
	 */
	protected static final int COLUMN_SALT = 3;

	/** 
	 * Index of column password
	 */
	protected static final int COLUMN_PASSWORD = 4;

	/** 
	 * Index of column active
	 */
	protected static final int COLUMN_ACTIVE = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Index of primary-key column email
	 */
	protected static final int PK_COLUMN_EMAIL = 2;

	/** 
	 * Inserts a new row in the user table.
	 */
	public UserPk insert(User dto) throws UserDaoException
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
		
			if (dto.isEmailModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "email" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSaltModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "salt" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPasswordModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "password" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isActiveModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "active" );
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
		
			if (dto.isEmailModified()) {
				stmt.setString( index++, dto.getEmail() );
			}
		
			if (dto.isSaltModified()) {
				stmt.setString( index++, dto.getSalt() );
			}
		
			if (dto.isPasswordModified()) {
				stmt.setString( index++, dto.getPassword() );
			}
		
			if (dto.isActiveModified()) {
				stmt.setShort( index++, dto.getActive() );
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
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the user table.
	 */
	public void update(UserPk pk, User dto) throws UserDaoException
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
		
			if (dto.isEmailModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "email=?" );
				modified=true;
			}
		
			if (dto.isSaltModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "salt=?" );
				modified=true;
			}
		
			if (dto.isPasswordModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "password=?" );
				modified=true;
			}
		
			if (dto.isActiveModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "active=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id=? AND email=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdModified()) {
				stmt.setInt( index++, dto.getId() );
			}
		
			if (dto.isEmailModified()) {
				stmt.setString( index++, dto.getEmail() );
			}
		
			if (dto.isSaltModified()) {
				stmt.setString( index++, dto.getSalt() );
			}
		
			if (dto.isPasswordModified()) {
				stmt.setString( index++, dto.getPassword() );
			}
		
			if (dto.isActiveModified()) {
				stmt.setShort( index++, dto.getActive() );
			}
		
			stmt.setInt( index++, pk.getId() );
			stmt.setString( index++, pk.getEmail() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the user table.
	 */
	public void delete(UserPk pk) throws UserDaoException
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
			stmt.setString( 2, pk.getEmail() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the user table that matches the specified primary-key value.
	 */
	public User findByPrimaryKey(UserPk pk) throws UserDaoException
	{
		return findByPrimaryKey( pk.getId(), pk.getEmail() );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'id = :id AND email = :email'.
	 */
	public User findByPrimaryKey(int id, String email) throws UserDaoException
	{
		User ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ? AND email = ?", new Object[] {  new Integer(id), email } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the user table that match the criteria ''.
	 */
	public User[] findAll() throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id, email", null );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'id = :id'.
	 */
	public User[] findWhereIdEquals(int id) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'email = :email'.
	 */
	public User[] findWhereEmailEquals(String email) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE email = ? ORDER BY email", new Object[] { email } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'salt = :salt'.
	 */
	public User[] findWhereSaltEquals(String salt) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE salt = ? ORDER BY salt", new Object[] { salt } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'password = :password'.
	 */
	public User[] findWherePasswordEquals(String password) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE password = ? ORDER BY password", new Object[] { password } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'active = :active'.
	 */
	public User[] findWhereActiveEquals(short active) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE active = ? ORDER BY active", new Object[] {  new Short(active) } );
	}

	/**
	 * Method 'UserDaoImpl'
	 * 
	 */
	public UserDaoImpl()
	{
	}

	/**
	 * Method 'UserDaoImpl'
	 * 
	 * @param userConn
	 */
	public UserDaoImpl(final java.sql.Connection userConn)
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
		return "mydb.user";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected User fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			User dto = new User();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected User[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			User dto = new User();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		User ret[] = new User[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(User dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setEmail( rs.getString( COLUMN_EMAIL ) );
		dto.setSalt( rs.getString( COLUMN_SALT ) );
		dto.setPassword( rs.getString( COLUMN_PASSWORD ) );
		dto.setActive( rs.getShort( COLUMN_ACTIVE ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(User dto)
	{
		dto.setIdModified( false );
		dto.setEmailModified( false );
		dto.setSaltModified( false );
		dto.setPasswordModified( false );
		dto.setActiveModified( false );
	}

	/** 
	 * Returns all rows from the user table that match the specified arbitrary SQL statement
	 */
	public User[] findByDynamicSelect(String sql, Object[] sqlParams) throws UserDaoException
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
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the user table that match the specified arbitrary SQL statement
	 */
	public User[] findByDynamicWhere(String sql, Object[] sqlParams) throws UserDaoException
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
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
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

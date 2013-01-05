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

public class CurrenciesDaoImpl extends AbstractDAO implements CurrenciesDao
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
	protected final String SQL_SELECT = "SELECT id, code, currency, country FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, code, currency, country ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, code = ?, currency = ?, country = ? WHERE id = ? AND code = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ? AND code = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column code
	 */
	protected static final int COLUMN_CODE = 2;

	/** 
	 * Index of column currency
	 */
	protected static final int COLUMN_CURRENCY = 3;

	/** 
	 * Index of column country
	 */
	protected static final int COLUMN_COUNTRY = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Index of primary-key column code
	 */
	protected static final int PK_COLUMN_CODE = 2;

	/** 
	 * Inserts a new row in the currencies table.
	 */
	public CurrenciesPk insert(Currencies dto) throws CurrenciesDaoException
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
		
			if (dto.isCodeModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "code" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCurrencyModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "currency" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCountryModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "country" );
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
				stmt.setShort( index++, dto.getId() );
			}
		
			if (dto.isCodeModified()) {
				stmt.setString( index++, dto.getCode() );
			}
		
			if (dto.isCurrencyModified()) {
				stmt.setString( index++, dto.getCurrency() );
			}
		
			if (dto.isCountryModified()) {
				stmt.setString( index++, dto.getCountry() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setId( rs.getShort( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CurrenciesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the currencies table.
	 */
	public void update(CurrenciesPk pk, Currencies dto) throws CurrenciesDaoException
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
		
			if (dto.isCodeModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "code=?" );
				modified=true;
			}
		
			if (dto.isCurrencyModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "currency=?" );
				modified=true;
			}
		
			if (dto.isCountryModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "country=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id=? AND code=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdModified()) {
				stmt.setShort( index++, dto.getId() );
			}
		
			if (dto.isCodeModified()) {
				stmt.setString( index++, dto.getCode() );
			}
		
			if (dto.isCurrencyModified()) {
				stmt.setString( index++, dto.getCurrency() );
			}
		
			if (dto.isCountryModified()) {
				stmt.setString( index++, dto.getCountry() );
			}
		
			stmt.setShort( index++, pk.getId() );
			stmt.setString( index++, pk.getCode() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CurrenciesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the currencies table.
	 */
	public void delete(CurrenciesPk pk) throws CurrenciesDaoException
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
			stmt.setShort( 1, pk.getId() );
			stmt.setString( 2, pk.getCode() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CurrenciesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the currencies table that matches the specified primary-key value.
	 */
	public Currencies findByPrimaryKey(CurrenciesPk pk) throws CurrenciesDaoException
	{
		return findByPrimaryKey( pk.getId(), pk.getCode() );
	}

	/** 
	 * Returns all rows from the currencies table that match the criteria 'id = :id AND code = :code'.
	 */
	public Currencies findByPrimaryKey(short id, String code) throws CurrenciesDaoException
	{
		Currencies ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ? AND code = ?", new Object[] {  new Short(id), code } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the currencies table that match the criteria ''.
	 */
	public Currencies[] findAll() throws CurrenciesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id, code", null );
	}

	/** 
	 * Returns all rows from the currencies table that match the criteria 'id = :id'.
	 */
	public Currencies[] findWhereIdEquals(short id) throws CurrenciesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Short(id) } );
	}

	/** 
	 * Returns all rows from the currencies table that match the criteria 'code = :code'.
	 */
	public Currencies[] findWhereCodeEquals(String code) throws CurrenciesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE code = ? ORDER BY code", new Object[] { code } );
	}

	/** 
	 * Returns all rows from the currencies table that match the criteria 'currency = :currency'.
	 */
	public Currencies[] findWhereCurrencyEquals(String currency) throws CurrenciesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE currency = ? ORDER BY currency", new Object[] { currency } );
	}

	/** 
	 * Returns all rows from the currencies table that match the criteria 'country = :country'.
	 */
	public Currencies[] findWhereCountryEquals(String country) throws CurrenciesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE country = ? ORDER BY country", new Object[] { country } );
	}

	/**
	 * Method 'CurrenciesDaoImpl'
	 * 
	 */
	public CurrenciesDaoImpl()
	{
	}

	/**
	 * Method 'CurrenciesDaoImpl'
	 * 
	 * @param userConn
	 */
	public CurrenciesDaoImpl(final java.sql.Connection userConn)
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
		return "currencies";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Currencies fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Currencies dto = new Currencies();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Currencies[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Currencies dto = new Currencies();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Currencies ret[] = new Currencies[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Currencies dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getShort( COLUMN_ID ) );
		dto.setCode( rs.getString( COLUMN_CODE ) );
		dto.setCurrency( rs.getString( COLUMN_CURRENCY ) );
		dto.setCountry( rs.getString( COLUMN_COUNTRY ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Currencies dto)
	{
		dto.setIdModified( false );
		dto.setCodeModified( false );
		dto.setCurrencyModified( false );
		dto.setCountryModified( false );
	}

	/** 
	 * Returns all rows from the currencies table that match the specified arbitrary SQL statement
	 */
	public Currencies[] findByDynamicSelect(String sql, Object[] sqlParams) throws CurrenciesDaoException
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
			throw new CurrenciesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the currencies table that match the specified arbitrary SQL statement
	 */
	public Currencies[] findByDynamicWhere(String sql, Object[] sqlParams) throws CurrenciesDaoException
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
			throw new CurrenciesDaoException( "Exception: " + _e.getMessage(), _e );
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
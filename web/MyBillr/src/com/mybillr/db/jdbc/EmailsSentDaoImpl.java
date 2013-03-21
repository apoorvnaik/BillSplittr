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

public class EmailsSentDaoImpl extends AbstractDAO implements EmailsSentDao
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
	protected final String SQL_SELECT = "SELECT id, sender_id, receiver_id, subject, content FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id, sender_id, receiver_id, subject, content ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id = ?, sender_id = ?, receiver_id = ?, subject = ?, content = ? WHERE id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id = ?";

	/** 
	 * Index of column id
	 */
	protected static final int COLUMN_ID = 1;

	/** 
	 * Index of column sender_id
	 */
	protected static final int COLUMN_SENDER_ID = 2;

	/** 
	 * Index of column receiver_id
	 */
	protected static final int COLUMN_RECEIVER_ID = 3;

	/** 
	 * Index of column subject
	 */
	protected static final int COLUMN_SUBJECT = 4;

	/** 
	 * Index of column content
	 */
	protected static final int COLUMN_CONTENT = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column id
	 */
	protected static final int PK_COLUMN_ID = 1;

	/** 
	 * Inserts a new row in the emails_sent table.
	 */
	public EmailsSentPk insert(EmailsSent dto) throws EmailsSentDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getId() );
			stmt.setInt( index++, dto.getSenderId() );
			stmt.setInt( index++, dto.getReceiverId() );
			stmt.setString( index++, dto.getSubject() );
			stmt.setString( index++, dto.getContent() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
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
			throw new EmailsSentDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the emails_sent table.
	 */
	public void update(EmailsSentPk pk, EmailsSent dto) throws EmailsSentDaoException
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
			stmt.setInt( index++, dto.getId() );
			stmt.setInt( index++, dto.getSenderId() );
			stmt.setInt( index++, dto.getReceiverId() );
			stmt.setString( index++, dto.getSubject() );
			stmt.setString( index++, dto.getContent() );
			stmt.setInt( 6, pk.getId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmailsSentDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the emails_sent table.
	 */
	public void delete(EmailsSentPk pk) throws EmailsSentDaoException
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
			throw new EmailsSentDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the emails_sent table that matches the specified primary-key value.
	 */
	public EmailsSent findByPrimaryKey(EmailsSentPk pk) throws EmailsSentDaoException
	{
		return findByPrimaryKey( pk.getId() );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'id = :id'.
	 */
	public EmailsSent findByPrimaryKey(int id) throws EmailsSentDaoException
	{
		EmailsSent ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id = ?", new Object[] {  new Integer(id) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria ''.
	 */
	public EmailsSent[] findAll() throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id", null );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'sender_id = :senderId'.
	 */
	public EmailsSent[] findByUser(int senderId) throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sender_id = ?", new Object[] {  new Integer(senderId) } );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'receiver_id = :receiverId'.
	 */
	public EmailsSent[] findByUser2(int receiverId) throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE receiver_id = ?", new Object[] {  new Integer(receiverId) } );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'id = :id'.
	 */
	public EmailsSent[] findWhereIdEquals(int id) throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id = ? ORDER BY id", new Object[] {  new Integer(id) } );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'sender_id = :senderId'.
	 */
	public EmailsSent[] findWhereSenderIdEquals(int senderId) throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sender_id = ? ORDER BY sender_id", new Object[] {  new Integer(senderId) } );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'receiver_id = :receiverId'.
	 */
	public EmailsSent[] findWhereReceiverIdEquals(int receiverId) throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE receiver_id = ? ORDER BY receiver_id", new Object[] {  new Integer(receiverId) } );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'subject = :subject'.
	 */
	public EmailsSent[] findWhereSubjectEquals(String subject) throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE subject = ? ORDER BY subject", new Object[] { subject } );
	}

	/** 
	 * Returns all rows from the emails_sent table that match the criteria 'content = :content'.
	 */
	public EmailsSent[] findWhereContentEquals(String content) throws EmailsSentDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE content = ? ORDER BY content", new Object[] { content } );
	}

	/**
	 * Method 'EmailsSentDaoImpl'
	 * 
	 */
	public EmailsSentDaoImpl()
	{
	}

	/**
	 * Method 'EmailsSentDaoImpl'
	 * 
	 * @param userConn
	 */
	public EmailsSentDaoImpl(final java.sql.Connection userConn)
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
		return "emails_sent";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected EmailsSent fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			EmailsSent dto = new EmailsSent();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected EmailsSent[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			EmailsSent dto = new EmailsSent();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		EmailsSent ret[] = new EmailsSent[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(EmailsSent dto, ResultSet rs) throws SQLException
	{
		dto.setId( rs.getInt( COLUMN_ID ) );
		dto.setSenderId( rs.getInt( COLUMN_SENDER_ID ) );
		dto.setReceiverId( rs.getInt( COLUMN_RECEIVER_ID ) );
		dto.setSubject( rs.getString( COLUMN_SUBJECT ) );
		dto.setContent( rs.getString( COLUMN_CONTENT ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(EmailsSent dto)
	{
	}

	/** 
	 * Returns all rows from the emails_sent table that match the specified arbitrary SQL statement
	 */
	public EmailsSent[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmailsSentDaoException
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
			throw new EmailsSentDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the emails_sent table that match the specified arbitrary SQL statement
	 */
	public EmailsSent[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmailsSentDaoException
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
			throw new EmailsSentDaoException( "Exception: " + _e.getMessage(), _e );
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

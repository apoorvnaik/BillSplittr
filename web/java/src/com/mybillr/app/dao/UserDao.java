/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.app.dao;

import java.util.Date;
import com.mybillr.app.dto.*;
import com.mybillr.app.exceptions.*;

public interface UserDao
{
	/** 
	 * Inserts a new row in the user table.
	 */
	public UserPk insert(User dto) throws UserDaoException;

	/** 
	 * Updates a single row in the user table.
	 */
	public void update(UserPk pk, User dto) throws UserDaoException;

	/** 
	 * Deletes a single row in the user table.
	 */
	public void delete(UserPk pk) throws UserDaoException;

	/** 
	 * Returns the rows from the user table that matches the specified primary-key value.
	 */
	public User findByPrimaryKey(UserPk pk) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'id = :id'.
	 */
	public User findByPrimaryKey(int id) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria ''.
	 */
	public User[] findAll() throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'id = :id'.
	 */
	public User[] findWhereIdEquals(int id) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'fname = :fname'.
	 */
	public User[] findWhereFnameEquals(String fname) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'lname = :lname'.
	 */
	public User[] findWhereLnameEquals(String lname) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'email = :email'.
	 */
	public User[] findWhereEmailEquals(String email) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'phone = :phone'.
	 */
	public User[] findWherePhoneEquals(int phone) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'salt = :salt'.
	 */
	public User[] findWhereSaltEquals(String salt) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'password = :password'.
	 */
	public User[] findWherePasswordEquals(String password) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'created_on = :createdOn'.
	 */
	public User[] findWhereCreatedOnEquals(Date createdOn) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'updated_on = :updatedOn'.
	 */
	public User[] findWhereUpdatedOnEquals(Date updatedOn) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the criteria 'last_logged = :lastLogged'.
	 */
	public User[] findWhereLastLoggedEquals(Date lastLogged) throws UserDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the user table that match the specified arbitrary SQL statement
	 */
	public User[] findByDynamicSelect(String sql, Object[] sqlParams) throws UserDaoException;

	/** 
	 * Returns all rows from the user table that match the specified arbitrary SQL statement
	 */
	public User[] findByDynamicWhere(String sql, Object[] sqlParams) throws UserDaoException;

}
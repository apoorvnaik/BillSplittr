/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.dao;

import com.mybillr.db.dto.*;
import com.mybillr.db.exceptions.*;

public interface PasswordResetDao
{
	/** 
	 * Inserts a new row in the password_reset table.
	 */
	public PasswordResetPk insert(PasswordReset dto) throws PasswordResetDaoException;

	/** 
	 * Updates a single row in the password_reset table.
	 */
	public void update(PasswordResetPk pk, PasswordReset dto) throws PasswordResetDaoException;

	/** 
	 * Deletes a single row in the password_reset table.
	 */
	public void delete(PasswordResetPk pk) throws PasswordResetDaoException;

	/** 
	 * Returns the rows from the password_reset table that matches the specified primary-key value.
	 */
	public PasswordReset findByPrimaryKey(PasswordResetPk pk) throws PasswordResetDaoException;

	/** 
	 * Returns all rows from the password_reset table that match the criteria 'id = :id'.
	 */
	public PasswordReset findByPrimaryKey(int id) throws PasswordResetDaoException;

	/** 
	 * Returns all rows from the password_reset table that match the criteria ''.
	 */
	public PasswordReset[] findAll() throws PasswordResetDaoException;

	/** 
	 * Returns all rows from the password_reset table that match the criteria 'user_id = :userId'.
	 */
	public PasswordReset[] findByUser(int userId) throws PasswordResetDaoException;

	/** 
	 * Returns all rows from the password_reset table that match the criteria 'id = :id'.
	 */
	public PasswordReset[] findWhereIdEquals(int id) throws PasswordResetDaoException;

	/** 
	 * Returns all rows from the password_reset table that match the criteria 'user_id = :userId'.
	 */
	public PasswordReset[] findWhereUserIdEquals(int userId) throws PasswordResetDaoException;

	/** 
	 * Returns all rows from the password_reset table that match the criteria 'reset_hash = :resetHash'.
	 */
	public PasswordReset[] findWhereResetHashEquals(String resetHash) throws PasswordResetDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the password_reset table that match the specified arbitrary SQL statement
	 */
	public PasswordReset[] findByDynamicSelect(String sql, Object[] sqlParams) throws PasswordResetDaoException;

	/** 
	 * Returns all rows from the password_reset table that match the specified arbitrary SQL statement
	 */
	public PasswordReset[] findByDynamicWhere(String sql, Object[] sqlParams) throws PasswordResetDaoException;

}

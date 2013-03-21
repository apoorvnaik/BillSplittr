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

public interface DebtDao
{
	/** 
	 * Inserts a new row in the debt table.
	 */
	public DebtPk insert(Debt dto) throws DebtDaoException;

	/** 
	 * Updates a single row in the debt table.
	 */
	public void update(DebtPk pk, Debt dto) throws DebtDaoException;

	/** 
	 * Deletes a single row in the debt table.
	 */
	public void delete(DebtPk pk) throws DebtDaoException;

	/** 
	 * Returns the rows from the debt table that matches the specified primary-key value.
	 */
	public Debt findByPrimaryKey(DebtPk pk) throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the criteria 'id = :id AND owed_by = :owedBy AND owed_to = :owedTo'.
	 */
	public Debt findByPrimaryKey(int id, int owedBy, int owedTo) throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the criteria ''.
	 */
	public Debt[] findAll() throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the criteria 'owed_by = :owedBy'.
	 */
	public Debt[] findByUser(int owedBy) throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the criteria 'owed_to = :owedTo'.
	 */
	public Debt[] findByUser2(int owedTo) throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the criteria 'id = :id'.
	 */
	public Debt[] findWhereIdEquals(int id) throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the criteria 'owed_by = :owedBy'.
	 */
	public Debt[] findWhereOwedByEquals(int owedBy) throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the criteria 'owed_to = :owedTo'.
	 */
	public Debt[] findWhereOwedToEquals(int owedTo) throws DebtDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the debt table that match the specified arbitrary SQL statement
	 */
	public Debt[] findByDynamicSelect(String sql, Object[] sqlParams) throws DebtDaoException;

	/** 
	 * Returns all rows from the debt table that match the specified arbitrary SQL statement
	 */
	public Debt[] findByDynamicWhere(String sql, Object[] sqlParams) throws DebtDaoException;

}
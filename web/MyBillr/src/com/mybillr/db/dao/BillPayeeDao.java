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

public interface BillPayeeDao
{
	/** 
	 * Inserts a new row in the bill_payee table.
	 */
	public BillPayeePk insert(BillPayee dto) throws BillPayeeDaoException;

	/** 
	 * Updates a single row in the bill_payee table.
	 */
	public void update(BillPayeePk pk, BillPayee dto) throws BillPayeeDaoException;

	/** 
	 * Deletes a single row in the bill_payee table.
	 */
	public void delete(BillPayeePk pk) throws BillPayeeDaoException;

	/** 
	 * Returns the rows from the bill_payee table that matches the specified primary-key value.
	 */
	public BillPayee findByPrimaryKey(BillPayeePk pk) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'bill_id = :billId AND user_id = :userId'.
	 */
	public BillPayee findByPrimaryKey(int billId, int userId) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria ''.
	 */
	public BillPayee[] findAll() throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'bill_id = :billId'.
	 */
	public BillPayee[] findByBill(int billId) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'user_id = :userId'.
	 */
	public BillPayee[] findByUser(int userId) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'bill_id = :billId'.
	 */
	public BillPayee[] findWhereBillIdEquals(int billId) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'user_id = :userId'.
	 */
	public BillPayee[] findWhereUserIdEquals(int userId) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'share = :share'.
	 */
	public BillPayee[] findWhereShareEquals(long share) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'amount = :amount'.
	 */
	public BillPayee[] findWhereAmountEquals(long amount) throws BillPayeeDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the bill_payee table that match the specified arbitrary SQL statement
	 */
	public BillPayee[] findByDynamicSelect(String sql, Object[] sqlParams) throws BillPayeeDaoException;

	/** 
	 * Returns all rows from the bill_payee table that match the specified arbitrary SQL statement
	 */
	public BillPayee[] findByDynamicWhere(String sql, Object[] sqlParams) throws BillPayeeDaoException;

}

/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.app.dao;

import com.mybillr.app.dto.*;
import com.mybillr.app.exceptions.*;

public interface LedgerDao
{
	/** 
	 * Inserts a new row in the ledger table.
	 */
	public LedgerPk insert(Ledger dto) throws LedgerDaoException;

	/** 
	 * Updates a single row in the ledger table.
	 */
	public void update(LedgerPk pk, Ledger dto) throws LedgerDaoException;

	/** 
	 * Deletes a single row in the ledger table.
	 */
	public void delete(LedgerPk pk) throws LedgerDaoException;

	/** 
	 * Returns the rows from the ledger table that matches the specified primary-key value.
	 */
	public Ledger findByPrimaryKey(LedgerPk pk) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'id = :id AND currency = :currency'.
	 */
	public Ledger findByPrimaryKey(int id, int currency) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria ''.
	 */
	public Ledger[] findAll() throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'owes_to = :owesTo'.
	 */
	public Ledger[] findByUser(int owesTo) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'owed_by = :owedBy'.
	 */
	public Ledger[] findByUser2(int owedBy) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'id = :id'.
	 */
	public Ledger[] findWhereIdEquals(int id) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'owed_by = :owedBy'.
	 */
	public Ledger[] findWhereOwedByEquals(int owedBy) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'owes_to = :owesTo'.
	 */
	public Ledger[] findWhereOwesToEquals(int owesTo) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'amount = :amount'.
	 */
	public Ledger[] findWhereAmountEquals(int amount) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the criteria 'currency = :currency'.
	 */
	public Ledger[] findWhereCurrencyEquals(int currency) throws LedgerDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ledger table that match the specified arbitrary SQL statement
	 */
	public Ledger[] findByDynamicSelect(String sql, Object[] sqlParams) throws LedgerDaoException;

	/** 
	 * Returns all rows from the ledger table that match the specified arbitrary SQL statement
	 */
	public Ledger[] findByDynamicWhere(String sql, Object[] sqlParams) throws LedgerDaoException;

}
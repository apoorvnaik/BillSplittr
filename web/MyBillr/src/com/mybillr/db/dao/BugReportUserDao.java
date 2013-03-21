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

public interface BugReportUserDao
{
	/** 
	 * Inserts a new row in the bug_report_user table.
	 */
	public BugReportUserPk insert(BugReportUser dto) throws BugReportUserDaoException;

	/** 
	 * Updates a single row in the bug_report_user table.
	 */
	public void update(BugReportUserPk pk, BugReportUser dto) throws BugReportUserDaoException;

	/** 
	 * Deletes a single row in the bug_report_user table.
	 */
	public void delete(BugReportUserPk pk) throws BugReportUserDaoException;

	/** 
	 * Returns the rows from the bug_report_user table that matches the specified primary-key value.
	 */
	public BugReportUser findByPrimaryKey(BugReportUserPk pk) throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the criteria 'id = :id'.
	 */
	public BugReportUser findByPrimaryKey(int id) throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the criteria ''.
	 */
	public BugReportUser[] findAll() throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the criteria 'reported_by = :reportedBy'.
	 */
	public BugReportUser[] findByUser(int reportedBy) throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the criteria 'id = :id'.
	 */
	public BugReportUser[] findWhereIdEquals(int id) throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the criteria 'reported_by = :reportedBy'.
	 */
	public BugReportUser[] findWhereReportedByEquals(int reportedBy) throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the criteria 'title = :title'.
	 */
	public BugReportUser[] findWhereTitleEquals(String title) throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the criteria 'bug = :bug'.
	 */
	public BugReportUser[] findWhereBugEquals(String bug) throws BugReportUserDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the bug_report_user table that match the specified arbitrary SQL statement
	 */
	public BugReportUser[] findByDynamicSelect(String sql, Object[] sqlParams) throws BugReportUserDaoException;

	/** 
	 * Returns all rows from the bug_report_user table that match the specified arbitrary SQL statement
	 */
	public BugReportUser[] findByDynamicWhere(String sql, Object[] sqlParams) throws BugReportUserDaoException;

}
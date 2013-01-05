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

public interface FriendsDao
{
	/** 
	 * Inserts a new row in the friends table.
	 */
	public FriendsPk insert(Friends dto) throws FriendsDaoException;

	/** 
	 * Updates a single row in the friends table.
	 */
	public void update(FriendsPk pk, Friends dto) throws FriendsDaoException;

	/** 
	 * Deletes a single row in the friends table.
	 */
	public void delete(FriendsPk pk) throws FriendsDaoException;

	/** 
	 * Returns the rows from the friends table that matches the specified primary-key value.
	 */
	public Friends findByPrimaryKey(FriendsPk pk) throws FriendsDaoException;

	/** 
	 * Returns all rows from the friends table that match the criteria 'user_id = :userId AND friend_id = :friendId'.
	 */
	public Friends findByPrimaryKey(int userId, int friendId) throws FriendsDaoException;

	/** 
	 * Returns all rows from the friends table that match the criteria ''.
	 */
	public Friends[] findAll() throws FriendsDaoException;

	/** 
	 * Returns all rows from the friends table that match the criteria 'user_id = :userId'.
	 */
	public Friends[] findByUser(int userId) throws FriendsDaoException;

	/** 
	 * Returns all rows from the friends table that match the criteria 'friend_id = :friendId'.
	 */
	public Friends[] findByUser2(int friendId) throws FriendsDaoException;

	/** 
	 * Returns all rows from the friends table that match the criteria 'user_id = :userId'.
	 */
	public Friends[] findWhereUserIdEquals(int userId) throws FriendsDaoException;

	/** 
	 * Returns all rows from the friends table that match the criteria 'friend_id = :friendId'.
	 */
	public Friends[] findWhereFriendIdEquals(int friendId) throws FriendsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the friends table that match the specified arbitrary SQL statement
	 */
	public Friends[] findByDynamicSelect(String sql, Object[] sqlParams) throws FriendsDaoException;

	/** 
	 * Returns all rows from the friends table that match the specified arbitrary SQL statement
	 */
	public Friends[] findByDynamicWhere(String sql, Object[] sqlParams) throws FriendsDaoException;

}
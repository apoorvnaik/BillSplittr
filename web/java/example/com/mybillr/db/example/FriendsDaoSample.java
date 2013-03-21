/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import com.mybillr.db.dao.FriendsDao;
import com.mybillr.db.dto.Friends;
import com.mybillr.db.exceptions.FriendsDaoException;
import com.mybillr.db.factory.FriendsDaoFactory;

public class FriendsDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByUser(0);
		// findByUser2(0);
		// findWhereUserIdEquals(0);
		// findWhereFriendsWithEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			FriendsDao _dao = getFriendsDao();
			Friends _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByUser'
	 * 
	 * @param userId
	 */
	public static void findByUser(int userId)
	{
		try {
			FriendsDao _dao = getFriendsDao();
			Friends _result[] = _dao.findByUser(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByUser2'
	 * 
	 * @param friendsWith
	 */
	public static void findByUser2(int friendsWith)
	{
		try {
			FriendsDao _dao = getFriendsDao();
			Friends _result[] = _dao.findByUser2(friendsWith);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUserIdEquals'
	 * 
	 * @param userId
	 */
	public static void findWhereUserIdEquals(int userId)
	{
		try {
			FriendsDao _dao = getFriendsDao();
			Friends _result[] = _dao.findWhereUserIdEquals(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFriendsWithEquals'
	 * 
	 * @param friendsWith
	 */
	public static void findWhereFriendsWithEquals(int friendsWith)
	{
		try {
			FriendsDao _dao = getFriendsDao();
			Friends _result[] = _dao.findWhereFriendsWithEquals(friendsWith);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getFriendsDao'
	 * 
	 * @return FriendsDao
	 */
	public static FriendsDao getFriendsDao()
	{
		return FriendsDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Friends dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getUserId() );
		buf.append( ", " );
		buf.append( dto.getFriendsWith() );
		System.out.println( buf.toString() );
	}

}

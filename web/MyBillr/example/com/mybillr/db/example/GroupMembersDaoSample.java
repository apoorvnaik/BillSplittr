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
import com.mybillr.db.dao.GroupMembersDao;
import com.mybillr.db.dto.GroupMembers;
import com.mybillr.db.exceptions.GroupMembersDaoException;
import com.mybillr.db.factory.GroupMembersDaoFactory;

public class GroupMembersDaoSample
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
		// findByGroup(0);
		// findByUser(0);
		// findWhereGroupIdEquals(0);
		// findWhereUserIdEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			GroupMembersDao _dao = getGroupMembersDao();
			GroupMembers _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByGroup'
	 * 
	 * @param groupId
	 */
	public static void findByGroup(int groupId)
	{
		try {
			GroupMembersDao _dao = getGroupMembersDao();
			GroupMembers _result[] = _dao.findByGroup(groupId);
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
			GroupMembersDao _dao = getGroupMembersDao();
			GroupMembers _result[] = _dao.findByUser(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGroupIdEquals'
	 * 
	 * @param groupId
	 */
	public static void findWhereGroupIdEquals(int groupId)
	{
		try {
			GroupMembersDao _dao = getGroupMembersDao();
			GroupMembers _result[] = _dao.findWhereGroupIdEquals(groupId);
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
			GroupMembersDao _dao = getGroupMembersDao();
			GroupMembers _result[] = _dao.findWhereUserIdEquals(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getGroupMembersDao'
	 * 
	 * @return GroupMembersDao
	 */
	public static GroupMembersDao getGroupMembersDao()
	{
		return GroupMembersDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(GroupMembers dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getGroupId() );
		buf.append( ", " );
		buf.append( dto.getUserId() );
		System.out.println( buf.toString() );
	}

}
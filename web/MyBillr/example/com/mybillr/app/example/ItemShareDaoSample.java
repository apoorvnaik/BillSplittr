/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.app.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import com.mybillr.app.dao.ItemShareDao;
import com.mybillr.app.dto.ItemShare;
import com.mybillr.app.exceptions.ItemShareDaoException;
import com.mybillr.app.factory.ItemShareDaoFactory;

public class ItemShareDaoSample
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
		// findByItems(0);
		// findByUser(0);
		// findWhereIdEquals(0);
		// findWhereItemIdEquals(0);
		// findWhereUserIdEquals(0);
		// findWhereShareEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ItemShareDao _dao = getItemShareDao();
			ItemShare _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByItems'
	 * 
	 * @param itemId
	 */
	public static void findByItems(int itemId)
	{
		try {
			ItemShareDao _dao = getItemShareDao();
			ItemShare _result[] = _dao.findByItems(itemId);
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
			ItemShareDao _dao = getItemShareDao();
			ItemShare _result[] = _dao.findByUser(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdEquals'
	 * 
	 * @param id
	 */
	public static void findWhereIdEquals(int id)
	{
		try {
			ItemShareDao _dao = getItemShareDao();
			ItemShare _result[] = _dao.findWhereIdEquals(id);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereItemIdEquals'
	 * 
	 * @param itemId
	 */
	public static void findWhereItemIdEquals(int itemId)
	{
		try {
			ItemShareDao _dao = getItemShareDao();
			ItemShare _result[] = _dao.findWhereItemIdEquals(itemId);
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
			ItemShareDao _dao = getItemShareDao();
			ItemShare _result[] = _dao.findWhereUserIdEquals(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereShareEquals'
	 * 
	 * @param share
	 */
	public static void findWhereShareEquals(int share)
	{
		try {
			ItemShareDao _dao = getItemShareDao();
			ItemShare _result[] = _dao.findWhereShareEquals(share);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getItemShareDao'
	 * 
	 * @return ItemShareDao
	 */
	public static ItemShareDao getItemShareDao()
	{
		return ItemShareDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ItemShare dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getId() );
		buf.append( ", " );
		buf.append( dto.getItemId() );
		buf.append( ", " );
		buf.append( dto.getUserId() );
		buf.append( ", " );
		buf.append( dto.getShare() );
		System.out.println( buf.toString() );
	}

}

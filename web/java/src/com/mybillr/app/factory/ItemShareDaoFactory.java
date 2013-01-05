/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.app.factory;

import java.sql.Connection;
import com.mybillr.app.dao.*;
import com.mybillr.app.jdbc.*;

public class ItemShareDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ItemShareDao
	 */
	public static ItemShareDao create()
	{
		return new ItemShareDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ItemShareDao
	 */
	public static ItemShareDao create(Connection conn)
	{
		return new ItemShareDaoImpl( conn );
	}

}

/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.factory;

import java.sql.Connection;
import com.mybillr.db.dao.*;
import com.mybillr.db.jdbc.*;

public class BillDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return BillDao
	 */
	public static BillDao create()
	{
		return new BillDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return BillDao
	 */
	public static BillDao create(Connection conn)
	{
		return new BillDaoImpl( conn );
	}

}
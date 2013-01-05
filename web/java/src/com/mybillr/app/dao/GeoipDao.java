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

public interface GeoipDao
{
	/** 
	 * Inserts a new row in the geoip table.
	 */
	public void insert(Geoip dto) throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the criteria ''.
	 */
	public Geoip[] findAll() throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the criteria 'start = :start'.
	 */
	public Geoip[] findWhereStartEquals(String start) throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the criteria 'end = :end'.
	 */
	public Geoip[] findWhereEndEquals(String end) throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the criteria 'start_int = :startInt'.
	 */
	public Geoip[] findWhereStartIntEquals(int startInt) throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the criteria 'end_int = :endInt'.
	 */
	public Geoip[] findWhereEndIntEquals(int endInt) throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the criteria 'country_symbol = :countrySymbol'.
	 */
	public Geoip[] findWhereCountrySymbolEquals(String countrySymbol) throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the criteria 'country = :country'.
	 */
	public Geoip[] findWhereCountryEquals(String country) throws GeoipDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the geoip table that match the specified arbitrary SQL statement
	 */
	public Geoip[] findByDynamicSelect(String sql, Object[] sqlParams) throws GeoipDaoException;

	/** 
	 * Returns all rows from the geoip table that match the specified arbitrary SQL statement
	 */
	public Geoip[] findByDynamicWhere(String sql, Object[] sqlParams) throws GeoipDaoException;

}
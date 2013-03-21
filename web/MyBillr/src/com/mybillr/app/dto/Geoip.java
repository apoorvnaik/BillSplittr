/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.app.dto;

import com.mybillr.app.dao.*;
import com.mybillr.app.factory.*;
import com.mybillr.app.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Geoip implements Serializable
{
	/** 
	 * This attribute maps to the column start in the geoip table.
	 */
	protected String start;

	/** 
	 * This attribute represents whether the attribute start has been modified since being read from the database.
	 */
	protected boolean startModified = false;

	/** 
	 * This attribute maps to the column end in the geoip table.
	 */
	protected String end;

	/** 
	 * This attribute represents whether the attribute end has been modified since being read from the database.
	 */
	protected boolean endModified = false;

	/** 
	 * This attribute maps to the column start_int in the geoip table.
	 */
	protected int startInt;

	/** 
	 * This attribute represents whether the attribute startInt has been modified since being read from the database.
	 */
	protected boolean startIntModified = false;

	/** 
	 * This attribute maps to the column end_int in the geoip table.
	 */
	protected int endInt;

	/** 
	 * This attribute represents whether the attribute endInt has been modified since being read from the database.
	 */
	protected boolean endIntModified = false;

	/** 
	 * This attribute maps to the column country_symbol in the geoip table.
	 */
	protected String countrySymbol;

	/** 
	 * This attribute represents whether the attribute countrySymbol has been modified since being read from the database.
	 */
	protected boolean countrySymbolModified = false;

	/** 
	 * This attribute maps to the column country in the geoip table.
	 */
	protected String country;

	/** 
	 * This attribute represents whether the attribute country has been modified since being read from the database.
	 */
	protected boolean countryModified = false;

	/**
	 * Method 'Geoip'
	 * 
	 */
	public Geoip()
	{
	}

	/**
	 * Method 'getStart'
	 * 
	 * @return String
	 */
	public String getStart()
	{
		return start;
	}

	/**
	 * Method 'setStart'
	 * 
	 * @param start
	 */
	public void setStart(String start)
	{
		this.start = start;
		this.startModified = true;
	}

	/** 
	 * Sets the value of startModified
	 */
	public void setStartModified(boolean startModified)
	{
		this.startModified = startModified;
	}

	/** 
	 * Gets the value of startModified
	 */
	public boolean isStartModified()
	{
		return startModified;
	}

	/**
	 * Method 'getEnd'
	 * 
	 * @return String
	 */
	public String getEnd()
	{
		return end;
	}

	/**
	 * Method 'setEnd'
	 * 
	 * @param end
	 */
	public void setEnd(String end)
	{
		this.end = end;
		this.endModified = true;
	}

	/** 
	 * Sets the value of endModified
	 */
	public void setEndModified(boolean endModified)
	{
		this.endModified = endModified;
	}

	/** 
	 * Gets the value of endModified
	 */
	public boolean isEndModified()
	{
		return endModified;
	}

	/**
	 * Method 'getStartInt'
	 * 
	 * @return int
	 */
	public int getStartInt()
	{
		return startInt;
	}

	/**
	 * Method 'setStartInt'
	 * 
	 * @param startInt
	 */
	public void setStartInt(int startInt)
	{
		this.startInt = startInt;
		this.startIntModified = true;
	}

	/** 
	 * Sets the value of startIntModified
	 */
	public void setStartIntModified(boolean startIntModified)
	{
		this.startIntModified = startIntModified;
	}

	/** 
	 * Gets the value of startIntModified
	 */
	public boolean isStartIntModified()
	{
		return startIntModified;
	}

	/**
	 * Method 'getEndInt'
	 * 
	 * @return int
	 */
	public int getEndInt()
	{
		return endInt;
	}

	/**
	 * Method 'setEndInt'
	 * 
	 * @param endInt
	 */
	public void setEndInt(int endInt)
	{
		this.endInt = endInt;
		this.endIntModified = true;
	}

	/** 
	 * Sets the value of endIntModified
	 */
	public void setEndIntModified(boolean endIntModified)
	{
		this.endIntModified = endIntModified;
	}

	/** 
	 * Gets the value of endIntModified
	 */
	public boolean isEndIntModified()
	{
		return endIntModified;
	}

	/**
	 * Method 'getCountrySymbol'
	 * 
	 * @return String
	 */
	public String getCountrySymbol()
	{
		return countrySymbol;
	}

	/**
	 * Method 'setCountrySymbol'
	 * 
	 * @param countrySymbol
	 */
	public void setCountrySymbol(String countrySymbol)
	{
		this.countrySymbol = countrySymbol;
		this.countrySymbolModified = true;
	}

	/** 
	 * Sets the value of countrySymbolModified
	 */
	public void setCountrySymbolModified(boolean countrySymbolModified)
	{
		this.countrySymbolModified = countrySymbolModified;
	}

	/** 
	 * Gets the value of countrySymbolModified
	 */
	public boolean isCountrySymbolModified()
	{
		return countrySymbolModified;
	}

	/**
	 * Method 'getCountry'
	 * 
	 * @return String
	 */
	public String getCountry()
	{
		return country;
	}

	/**
	 * Method 'setCountry'
	 * 
	 * @param country
	 */
	public void setCountry(String country)
	{
		this.country = country;
		this.countryModified = true;
	}

	/** 
	 * Sets the value of countryModified
	 */
	public void setCountryModified(boolean countryModified)
	{
		this.countryModified = countryModified;
	}

	/** 
	 * Gets the value of countryModified
	 */
	public boolean isCountryModified()
	{
		return countryModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Geoip)) {
			return false;
		}
		
		final Geoip _cast = (Geoip) _other;
		if (start == null ? _cast.start != start : !start.equals( _cast.start )) {
			return false;
		}
		
		if (startModified != _cast.startModified) {
			return false;
		}
		
		if (end == null ? _cast.end != end : !end.equals( _cast.end )) {
			return false;
		}
		
		if (endModified != _cast.endModified) {
			return false;
		}
		
		if (startInt != _cast.startInt) {
			return false;
		}
		
		if (startIntModified != _cast.startIntModified) {
			return false;
		}
		
		if (endInt != _cast.endInt) {
			return false;
		}
		
		if (endIntModified != _cast.endIntModified) {
			return false;
		}
		
		if (countrySymbol == null ? _cast.countrySymbol != countrySymbol : !countrySymbol.equals( _cast.countrySymbol )) {
			return false;
		}
		
		if (countrySymbolModified != _cast.countrySymbolModified) {
			return false;
		}
		
		if (country == null ? _cast.country != country : !country.equals( _cast.country )) {
			return false;
		}
		
		if (countryModified != _cast.countryModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (start != null) {
			_hashCode = 29 * _hashCode + start.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (startModified ? 1 : 0);
		if (end != null) {
			_hashCode = 29 * _hashCode + end.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (endModified ? 1 : 0);
		_hashCode = 29 * _hashCode + startInt;
		_hashCode = 29 * _hashCode + (startIntModified ? 1 : 0);
		_hashCode = 29 * _hashCode + endInt;
		_hashCode = 29 * _hashCode + (endIntModified ? 1 : 0);
		if (countrySymbol != null) {
			_hashCode = 29 * _hashCode + countrySymbol.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (countrySymbolModified ? 1 : 0);
		if (country != null) {
			_hashCode = 29 * _hashCode + country.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (countryModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mybillr.app.dto.Geoip: " );
		ret.append( "start=" + start );
		ret.append( ", end=" + end );
		ret.append( ", startInt=" + startInt );
		ret.append( ", endInt=" + endInt );
		ret.append( ", countrySymbol=" + countrySymbol );
		ret.append( ", country=" + country );
		return ret.toString();
	}

}

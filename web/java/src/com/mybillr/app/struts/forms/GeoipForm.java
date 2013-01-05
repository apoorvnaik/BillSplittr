package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GeoipForm extends ActionForm
{
	protected String start;

	protected String end;

	protected String startInt;

	protected String endInt;

	protected String countrySymbol;

	protected String country;

	protected String crudMethod;

	/** 
	 * Sets the value of start
	 */
	public void setStart(String start)
	{
		this.start = start;
	}

	/** 
	 * Gets the value of start
	 */
	public String getStart()
	{
		return start;
	}

	/** 
	 * Sets the value of end
	 */
	public void setEnd(String end)
	{
		this.end = end;
	}

	/** 
	 * Gets the value of end
	 */
	public String getEnd()
	{
		return end;
	}

	/** 
	 * Sets the value of startInt
	 */
	public void setStartInt(String startInt)
	{
		this.startInt = startInt;
	}

	/** 
	 * Gets the value of startInt
	 */
	public String getStartInt()
	{
		return startInt;
	}

	/** 
	 * Sets the value of endInt
	 */
	public void setEndInt(String endInt)
	{
		this.endInt = endInt;
	}

	/** 
	 * Gets the value of endInt
	 */
	public String getEndInt()
	{
		return endInt;
	}

	/** 
	 * Sets the value of countrySymbol
	 */
	public void setCountrySymbol(String countrySymbol)
	{
		this.countrySymbol = countrySymbol;
	}

	/** 
	 * Gets the value of countrySymbol
	 */
	public String getCountrySymbol()
	{
		return countrySymbol;
	}

	/** 
	 * Sets the value of country
	 */
	public void setCountry(String country)
	{
		this.country = country;
	}

	/** 
	 * Gets the value of country
	 */
	public String getCountry()
	{
		return country;
	}

	/** 
	 * Sets the value of crudMethod
	 */
	public void setCrudMethod(String crudMethod)
	{
		this.crudMethod = crudMethod;
	}

	/** 
	 * Gets the value of crudMethod
	 */
	public String getCrudMethod()
	{
		return crudMethod;
	}

	/**
	 * Method 'reset'
	 * 
	 */
	public void reset()
	{
		start = "";
		end = "";
		countrySymbol = "";
		country = "";
	}

	/**
	 * Method 'validate'
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors _errors = new ActionErrors();
		// attempt to parse startInt
		try {
			int _parsed_startInt = Integer.parseInt( startInt );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse endInt
		try {
			int _parsed_endInt = Integer.parseInt( endInt );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

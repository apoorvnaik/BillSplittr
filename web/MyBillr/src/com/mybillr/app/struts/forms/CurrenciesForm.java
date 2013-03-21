package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class CurrenciesForm extends ActionForm
{
	protected String id;

	protected String code;

	protected String currency;

	protected String country;

	protected String crudMethod;

	/** 
	 * Sets the value of id
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/** 
	 * Gets the value of id
	 */
	public String getId()
	{
		return id;
	}

	/** 
	 * Sets the value of code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/** 
	 * Gets the value of code
	 */
	public String getCode()
	{
		return code;
	}

	/** 
	 * Sets the value of currency
	 */
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	/** 
	 * Gets the value of currency
	 */
	public String getCurrency()
	{
		return currency;
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
		code = "";
		currency = "";
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
		// attempt to parse id
		try {
			short _parsed_id = Short.parseShort( id );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

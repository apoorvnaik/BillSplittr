package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GeoipFindWhereCountryEqualsForm extends ActionForm
{
	protected String country;

	protected String crudMethod;

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

}

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GeoipFindWhereCountrySymbolEqualsForm extends ActionForm
{
	protected String countrySymbol;

	protected String crudMethod;

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

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class CurrenciesFindWhereCurrencyEqualsForm extends ActionForm
{
	protected String currency;

	protected String crudMethod;

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

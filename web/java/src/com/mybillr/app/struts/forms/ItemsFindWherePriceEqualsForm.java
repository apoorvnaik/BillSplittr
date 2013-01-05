package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class ItemsFindWherePriceEqualsForm extends ActionForm
{
	protected String price;

	protected String crudMethod;

	/** 
	 * Sets the value of price
	 */
	public void setPrice(String price)
	{
		this.price = price;
	}

	/** 
	 * Gets the value of price
	 */
	public String getPrice()
	{
		return price;
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

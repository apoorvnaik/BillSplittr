package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class CurrenciesFindWhereCodeEqualsForm extends ActionForm
{
	protected String code;

	protected String crudMethod;

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

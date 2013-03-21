package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GeoipFindWhereEndIntEqualsForm extends ActionForm
{
	protected String endInt;

	protected String crudMethod;

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

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GeoipFindWhereStartIntEqualsForm extends ActionForm
{
	protected String startInt;

	protected String crudMethod;

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

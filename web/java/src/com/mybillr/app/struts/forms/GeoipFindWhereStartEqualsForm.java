package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GeoipFindWhereStartEqualsForm extends ActionForm
{
	protected String start;

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

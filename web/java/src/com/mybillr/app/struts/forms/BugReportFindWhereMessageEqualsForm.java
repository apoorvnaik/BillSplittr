package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class BugReportFindWhereMessageEqualsForm extends ActionForm
{
	protected String message;

	protected String crudMethod;

	/** 
	 * Sets the value of message
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/** 
	 * Gets the value of message
	 */
	public String getMessage()
	{
		return message;
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

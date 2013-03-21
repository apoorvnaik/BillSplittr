package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class EmailSentFindWhereToEqualsForm extends ActionForm
{
	protected String to;

	protected String crudMethod;

	/** 
	 * Sets the value of to
	 */
	public void setTo(String to)
	{
		this.to = to;
	}

	/** 
	 * Gets the value of to
	 */
	public String getTo()
	{
		return to;
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

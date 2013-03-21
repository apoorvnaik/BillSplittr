package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class EmailSentFindWhereFromEqualsForm extends ActionForm
{
	protected String from;

	protected String crudMethod;

	/** 
	 * Sets the value of from
	 */
	public void setFrom(String from)
	{
		this.from = from;
	}

	/** 
	 * Gets the value of from
	 */
	public String getFrom()
	{
		return from;
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

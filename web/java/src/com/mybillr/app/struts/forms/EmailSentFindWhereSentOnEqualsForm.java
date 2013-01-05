package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class EmailSentFindWhereSentOnEqualsForm extends ActionForm
{
	protected String sentOn;

	protected String crudMethod;

	/** 
	 * Sets the value of sentOn
	 */
	public void setSentOn(String sentOn)
	{
		this.sentOn = sentOn;
	}

	/** 
	 * Gets the value of sentOn
	 */
	public String getSentOn()
	{
		return sentOn;
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

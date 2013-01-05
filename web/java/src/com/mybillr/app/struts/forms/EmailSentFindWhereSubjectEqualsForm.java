package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class EmailSentFindWhereSubjectEqualsForm extends ActionForm
{
	protected String subject;

	protected String crudMethod;

	/** 
	 * Sets the value of subject
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	/** 
	 * Gets the value of subject
	 */
	public String getSubject()
	{
		return subject;
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

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWhereEmailEqualsForm extends ActionForm
{
	protected String email;

	protected String crudMethod;

	/** 
	 * Sets the value of email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/** 
	 * Gets the value of email
	 */
	public String getEmail()
	{
		return email;
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

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWhereLastLoggedEqualsForm extends ActionForm
{
	protected String lastLogged;

	protected String crudMethod;

	/** 
	 * Sets the value of lastLogged
	 */
	public void setLastLogged(String lastLogged)
	{
		this.lastLogged = lastLogged;
	}

	/** 
	 * Gets the value of lastLogged
	 */
	public String getLastLogged()
	{
		return lastLogged;
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

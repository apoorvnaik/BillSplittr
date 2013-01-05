package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWherePasswordEqualsForm extends ActionForm
{
	protected String password;

	protected String crudMethod;

	/** 
	 * Sets the value of password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/** 
	 * Gets the value of password
	 */
	public String getPassword()
	{
		return password;
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

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWhereLnameEqualsForm extends ActionForm
{
	protected String lname;

	protected String crudMethod;

	/** 
	 * Sets the value of lname
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
	}

	/** 
	 * Gets the value of lname
	 */
	public String getLname()
	{
		return lname;
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

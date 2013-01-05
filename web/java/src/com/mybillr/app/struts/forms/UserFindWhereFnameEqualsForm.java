package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWhereFnameEqualsForm extends ActionForm
{
	protected String fname;

	protected String crudMethod;

	/** 
	 * Sets the value of fname
	 */
	public void setFname(String fname)
	{
		this.fname = fname;
	}

	/** 
	 * Gets the value of fname
	 */
	public String getFname()
	{
		return fname;
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

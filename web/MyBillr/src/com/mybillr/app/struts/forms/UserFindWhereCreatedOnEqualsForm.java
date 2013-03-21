package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWhereCreatedOnEqualsForm extends ActionForm
{
	protected String createdOn;

	protected String crudMethod;

	/** 
	 * Sets the value of createdOn
	 */
	public void setCreatedOn(String createdOn)
	{
		this.createdOn = createdOn;
	}

	/** 
	 * Gets the value of createdOn
	 */
	public String getCreatedOn()
	{
		return createdOn;
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

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWhereUpdatedOnEqualsForm extends ActionForm
{
	protected String updatedOn;

	protected String crudMethod;

	/** 
	 * Sets the value of updatedOn
	 */
	public void setUpdatedOn(String updatedOn)
	{
		this.updatedOn = updatedOn;
	}

	/** 
	 * Gets the value of updatedOn
	 */
	public String getUpdatedOn()
	{
		return updatedOn;
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

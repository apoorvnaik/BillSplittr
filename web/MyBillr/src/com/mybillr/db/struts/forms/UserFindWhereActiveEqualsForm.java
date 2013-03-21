package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class UserFindWhereActiveEqualsForm extends ActionForm
{
	protected String active;

	protected String crudMethod;

	/** 
	 * Sets the value of active
	 */
	public void setActive(String active)
	{
		this.active = active;
	}

	/** 
	 * Gets the value of active
	 */
	public String getActive()
	{
		return active;
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

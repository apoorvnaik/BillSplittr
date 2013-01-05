package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserFindWherePhoneEqualsForm extends ActionForm
{
	protected String phone;

	protected String crudMethod;

	/** 
	 * Sets the value of phone
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/** 
	 * Gets the value of phone
	 */
	public String getPhone()
	{
		return phone;
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

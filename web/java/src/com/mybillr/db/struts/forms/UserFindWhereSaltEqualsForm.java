package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class UserFindWhereSaltEqualsForm extends ActionForm
{
	protected String salt;

	protected String crudMethod;

	/** 
	 * Sets the value of salt
	 */
	public void setSalt(String salt)
	{
		this.salt = salt;
	}

	/** 
	 * Gets the value of salt
	 */
	public String getSalt()
	{
		return salt;
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

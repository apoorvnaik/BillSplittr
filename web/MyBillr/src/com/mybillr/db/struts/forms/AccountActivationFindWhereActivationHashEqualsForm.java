package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class AccountActivationFindWhereActivationHashEqualsForm extends ActionForm
{
	protected String activationHash;

	protected String crudMethod;

	/** 
	 * Sets the value of activationHash
	 */
	public void setActivationHash(String activationHash)
	{
		this.activationHash = activationHash;
	}

	/** 
	 * Gets the value of activationHash
	 */
	public String getActivationHash()
	{
		return activationHash;
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

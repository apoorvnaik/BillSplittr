package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class EmailsSentFindWhereSenderIdEqualsForm extends ActionForm
{
	protected String senderId;

	protected String crudMethod;

	/** 
	 * Sets the value of senderId
	 */
	public void setSenderId(String senderId)
	{
		this.senderId = senderId;
	}

	/** 
	 * Gets the value of senderId
	 */
	public String getSenderId()
	{
		return senderId;
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

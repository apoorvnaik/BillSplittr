package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class EmailsSentFindByUser2Form extends ActionForm
{
	protected String receiverId;

	protected String crudMethod;

	/** 
	 * Sets the value of receiverId
	 */
	public void setReceiverId(String receiverId)
	{
		this.receiverId = receiverId;
	}

	/** 
	 * Gets the value of receiverId
	 */
	public String getReceiverId()
	{
		return receiverId;
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

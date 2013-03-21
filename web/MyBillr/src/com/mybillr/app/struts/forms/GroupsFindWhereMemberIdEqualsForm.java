package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GroupsFindWhereMemberIdEqualsForm extends ActionForm
{
	protected String memberId;

	protected String crudMethod;

	/** 
	 * Sets the value of memberId
	 */
	public void setMemberId(String memberId)
	{
		this.memberId = memberId;
	}

	/** 
	 * Gets the value of memberId
	 */
	public String getMemberId()
	{
		return memberId;
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

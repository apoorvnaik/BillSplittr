package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class SharedBillFindWhereParticipantsEqualsForm extends ActionForm
{
	protected String participants;

	protected String crudMethod;

	/** 
	 * Sets the value of participants
	 */
	public void setParticipants(String participants)
	{
		this.participants = participants;
	}

	/** 
	 * Gets the value of participants
	 */
	public String getParticipants()
	{
		return participants;
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

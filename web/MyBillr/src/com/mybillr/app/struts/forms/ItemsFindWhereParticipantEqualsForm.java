package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class ItemsFindWhereParticipantEqualsForm extends ActionForm
{
	protected String participant;

	protected String crudMethod;

	/** 
	 * Sets the value of participant
	 */
	public void setParticipant(String participant)
	{
		this.participant = participant;
	}

	/** 
	 * Gets the value of participant
	 */
	public String getParticipant()
	{
		return participant;
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

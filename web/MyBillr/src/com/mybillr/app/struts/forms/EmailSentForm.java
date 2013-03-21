package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class EmailSentForm extends ActionForm
{
	protected String id;

	protected String from;

	protected String to;

	protected String subject;

	protected String message;

	protected String sentOn;

	protected String crudMethod;

	/** 
	 * Sets the value of id
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/** 
	 * Gets the value of id
	 */
	public String getId()
	{
		return id;
	}

	/** 
	 * Sets the value of from
	 */
	public void setFrom(String from)
	{
		this.from = from;
	}

	/** 
	 * Gets the value of from
	 */
	public String getFrom()
	{
		return from;
	}

	/** 
	 * Sets the value of to
	 */
	public void setTo(String to)
	{
		this.to = to;
	}

	/** 
	 * Gets the value of to
	 */
	public String getTo()
	{
		return to;
	}

	/** 
	 * Sets the value of subject
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	/** 
	 * Gets the value of subject
	 */
	public String getSubject()
	{
		return subject;
	}

	/** 
	 * Sets the value of message
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/** 
	 * Gets the value of message
	 */
	public String getMessage()
	{
		return message;
	}

	/** 
	 * Sets the value of sentOn
	 */
	public void setSentOn(String sentOn)
	{
		this.sentOn = sentOn;
	}

	/** 
	 * Gets the value of sentOn
	 */
	public String getSentOn()
	{
		return sentOn;
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

	/**
	 * Method 'reset'
	 * 
	 */
	public void reset()
	{
		from = "";
		to = "";
		subject = "";
		message = "";
	}

	/**
	 * Method 'validate'
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors _errors = new ActionErrors();
		// attempt to parse id
		try {
			int _parsed_id = Integer.parseInt( id );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse sentOn
		try {
			java.util.Date _parsed_sentOn = (sentOn == null || sentOn.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( sentOn);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

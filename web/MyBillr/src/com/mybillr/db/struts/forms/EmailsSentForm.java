package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class EmailsSentForm extends ActionForm
{
	protected String id;

	protected String senderId;

	protected String receiverId;

	protected String subject;

	protected String content;

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
	 * Sets the value of content
	 */
	public void setContent(String content)
	{
		this.content = content;
	}

	/** 
	 * Gets the value of content
	 */
	public String getContent()
	{
		return content;
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
		subject = "";
		content = "";
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
		
		// attempt to parse senderId
		try {
			int _parsed_senderId = Integer.parseInt( senderId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse receiverId
		try {
			int _parsed_receiverId = Integer.parseInt( receiverId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

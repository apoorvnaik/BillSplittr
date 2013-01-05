package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class BugReportForm extends ActionForm
{
	protected String id;

	protected String title;

	protected String userId;

	protected String message;

	protected String reportedOn;

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
	 * Sets the value of title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/** 
	 * Gets the value of title
	 */
	public String getTitle()
	{
		return title;
	}

	/** 
	 * Sets the value of userId
	 */
	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	/** 
	 * Gets the value of userId
	 */
	public String getUserId()
	{
		return userId;
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
	 * Sets the value of reportedOn
	 */
	public void setReportedOn(String reportedOn)
	{
		this.reportedOn = reportedOn;
	}

	/** 
	 * Gets the value of reportedOn
	 */
	public String getReportedOn()
	{
		return reportedOn;
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
		title = "";
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
		
		// attempt to parse userId
		try {
			int _parsed_userId = Integer.parseInt( userId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse reportedOn
		try {
			java.util.Date _parsed_reportedOn = (reportedOn == null || reportedOn.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( reportedOn);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

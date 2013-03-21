package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BugReportGeneralForm extends ActionForm
{
	protected String id;

	protected String reportedBy;

	protected String title;

	protected String bug;

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
	 * Sets the value of reportedBy
	 */
	public void setReportedBy(String reportedBy)
	{
		this.reportedBy = reportedBy;
	}

	/** 
	 * Gets the value of reportedBy
	 */
	public String getReportedBy()
	{
		return reportedBy;
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
	 * Sets the value of bug
	 */
	public void setBug(String bug)
	{
		this.bug = bug;
	}

	/** 
	 * Gets the value of bug
	 */
	public String getBug()
	{
		return bug;
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
		reportedBy = "";
		title = "";
		bug = "";
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
		
		return _errors;
	}

}

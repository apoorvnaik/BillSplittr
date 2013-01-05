package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class BugReportFindWhereReportedOnEqualsForm extends ActionForm
{
	protected String reportedOn;

	protected String crudMethod;

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

}

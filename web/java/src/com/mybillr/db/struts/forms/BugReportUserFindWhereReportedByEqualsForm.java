package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BugReportUserFindWhereReportedByEqualsForm extends ActionForm
{
	protected String reportedBy;

	protected String crudMethod;

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

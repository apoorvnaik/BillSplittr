package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BugReportGeneralFindWhereBugEqualsForm extends ActionForm
{
	protected String bug;

	protected String crudMethod;

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

}

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class BugReportFindWhereTitleEqualsForm extends ActionForm
{
	protected String title;

	protected String crudMethod;

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

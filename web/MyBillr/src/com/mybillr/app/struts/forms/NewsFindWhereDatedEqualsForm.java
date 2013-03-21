package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class NewsFindWhereDatedEqualsForm extends ActionForm
{
	protected String dated;

	protected String crudMethod;

	/** 
	 * Sets the value of dated
	 */
	public void setDated(String dated)
	{
		this.dated = dated;
	}

	/** 
	 * Gets the value of dated
	 */
	public String getDated()
	{
		return dated;
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

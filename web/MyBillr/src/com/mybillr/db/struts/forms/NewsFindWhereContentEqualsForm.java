package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class NewsFindWhereContentEqualsForm extends ActionForm
{
	protected String content;

	protected String crudMethod;

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

}

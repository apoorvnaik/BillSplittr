package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class Table1FindWhereNameEqualsForm extends ActionForm
{
	protected String name;

	protected String crudMethod;

	/** 
	 * Sets the value of name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/** 
	 * Gets the value of name
	 */
	public String getName()
	{
		return name;
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

package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class SharedBillFindWhereItemsEqualsForm extends ActionForm
{
	protected String items;

	protected String crudMethod;

	/** 
	 * Sets the value of items
	 */
	public void setItems(String items)
	{
		this.items = items;
	}

	/** 
	 * Gets the value of items
	 */
	public String getItems()
	{
		return items;
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

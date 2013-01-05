package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class ItemShareFindWhereItemIdEqualsForm extends ActionForm
{
	protected String itemId;

	protected String crudMethod;

	/** 
	 * Sets the value of itemId
	 */
	public void setItemId(String itemId)
	{
		this.itemId = itemId;
	}

	/** 
	 * Gets the value of itemId
	 */
	public String getItemId()
	{
		return itemId;
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

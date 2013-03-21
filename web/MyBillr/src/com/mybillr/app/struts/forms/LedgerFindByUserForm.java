package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class LedgerFindByUserForm extends ActionForm
{
	protected String owesTo;

	protected String crudMethod;

	/** 
	 * Sets the value of owesTo
	 */
	public void setOwesTo(String owesTo)
	{
		this.owesTo = owesTo;
	}

	/** 
	 * Gets the value of owesTo
	 */
	public String getOwesTo()
	{
		return owesTo;
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

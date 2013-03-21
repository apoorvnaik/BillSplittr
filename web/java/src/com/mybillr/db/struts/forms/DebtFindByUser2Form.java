package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class DebtFindByUser2Form extends ActionForm
{
	protected String owedTo;

	protected String crudMethod;

	/** 
	 * Sets the value of owedTo
	 */
	public void setOwedTo(String owedTo)
	{
		this.owedTo = owedTo;
	}

	/** 
	 * Gets the value of owedTo
	 */
	public String getOwedTo()
	{
		return owedTo;
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

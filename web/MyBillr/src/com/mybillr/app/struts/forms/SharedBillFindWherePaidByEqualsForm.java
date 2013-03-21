package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class SharedBillFindWherePaidByEqualsForm extends ActionForm
{
	protected String paidBy;

	protected String crudMethod;

	/** 
	 * Sets the value of paidBy
	 */
	public void setPaidBy(String paidBy)
	{
		this.paidBy = paidBy;
	}

	/** 
	 * Gets the value of paidBy
	 */
	public String getPaidBy()
	{
		return paidBy;
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

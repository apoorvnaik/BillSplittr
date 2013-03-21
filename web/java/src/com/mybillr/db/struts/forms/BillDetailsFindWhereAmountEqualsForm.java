package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BillDetailsFindWhereAmountEqualsForm extends ActionForm
{
	protected String amount;

	protected String crudMethod;

	/** 
	 * Sets the value of amount
	 */
	public void setAmount(String amount)
	{
		this.amount = amount;
	}

	/** 
	 * Gets the value of amount
	 */
	public String getAmount()
	{
		return amount;
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

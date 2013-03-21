package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class Table1FindWhereRateEqualsForm extends ActionForm
{
	protected String rate;

	protected String crudMethod;

	/** 
	 * Sets the value of rate
	 */
	public void setRate(String rate)
	{
		this.rate = rate;
	}

	/** 
	 * Gets the value of rate
	 */
	public String getRate()
	{
		return rate;
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

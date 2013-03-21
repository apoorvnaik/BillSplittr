package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BillFindWhereTotalEqualsForm extends ActionForm
{
	protected String total;

	protected String crudMethod;

	/** 
	 * Sets the value of total
	 */
	public void setTotal(String total)
	{
		this.total = total;
	}

	/** 
	 * Gets the value of total
	 */
	public String getTotal()
	{
		return total;
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

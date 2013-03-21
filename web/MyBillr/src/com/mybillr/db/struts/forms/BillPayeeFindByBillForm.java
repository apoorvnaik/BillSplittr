package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BillPayeeFindByBillForm extends ActionForm
{
	protected String billId;

	protected String crudMethod;

	/** 
	 * Sets the value of billId
	 */
	public void setBillId(String billId)
	{
		this.billId = billId;
	}

	/** 
	 * Gets the value of billId
	 */
	public String getBillId()
	{
		return billId;
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

package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BillDetailsFindWhereShareEqualsForm extends ActionForm
{
	protected String share;

	protected String crudMethod;

	/** 
	 * Sets the value of share
	 */
	public void setShare(String share)
	{
		this.share = share;
	}

	/** 
	 * Gets the value of share
	 */
	public String getShare()
	{
		return share;
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

package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class BillPayeeForm extends ActionForm
{
	protected String billId;

	protected String userId;

	protected String share;

	protected String amount;

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
	 * Sets the value of userId
	 */
	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	/** 
	 * Gets the value of userId
	 */
	public String getUserId()
	{
		return userId;
	}

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

	/**
	 * Method 'reset'
	 * 
	 */
	public void reset()
	{
	}

	/**
	 * Method 'validate'
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
	{
		ActionErrors _errors = new ActionErrors();
		// attempt to parse billId
		try {
			int _parsed_billId = Integer.parseInt( billId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse userId
		try {
			int _parsed_userId = Integer.parseInt( userId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse share
		try {
			long _parsed_share = Long.parseLong( share );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse amount
		try {
			long _parsed_amount = Long.parseLong( amount );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

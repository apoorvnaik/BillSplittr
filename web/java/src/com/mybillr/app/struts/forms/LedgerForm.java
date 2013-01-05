package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class LedgerForm extends ActionForm
{
	protected String id;

	protected String owedBy;

	protected String owesTo;

	protected String amount;

	protected String currency;

	protected String crudMethod;

	/** 
	 * Sets the value of id
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/** 
	 * Gets the value of id
	 */
	public String getId()
	{
		return id;
	}

	/** 
	 * Sets the value of owedBy
	 */
	public void setOwedBy(String owedBy)
	{
		this.owedBy = owedBy;
	}

	/** 
	 * Gets the value of owedBy
	 */
	public String getOwedBy()
	{
		return owedBy;
	}

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
	 * Sets the value of currency
	 */
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	/** 
	 * Gets the value of currency
	 */
	public String getCurrency()
	{
		return currency;
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
		// attempt to parse id
		try {
			int _parsed_id = Integer.parseInt( id );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse owedBy
		try {
			int _parsed_owedBy = Integer.parseInt( owedBy );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse owesTo
		try {
			int _parsed_owesTo = Integer.parseInt( owesTo );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse amount
		try {
			int _parsed_amount = Integer.parseInt( amount );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse currency
		try {
			int _parsed_currency = Integer.parseInt( currency );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

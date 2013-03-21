package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class PasswordResetForm extends ActionForm
{
	protected String id;

	protected String userId;

	protected String resetHash;

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
	 * Sets the value of resetHash
	 */
	public void setResetHash(String resetHash)
	{
		this.resetHash = resetHash;
	}

	/** 
	 * Gets the value of resetHash
	 */
	public String getResetHash()
	{
		return resetHash;
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
		resetHash = "";
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
		
		// attempt to parse userId
		try {
			int _parsed_userId = Integer.parseInt( userId );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

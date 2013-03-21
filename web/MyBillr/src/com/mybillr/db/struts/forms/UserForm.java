package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class UserForm extends ActionForm
{
	protected String id;

	protected String email;

	protected String salt;

	protected String password;

	protected String active;

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
	 * Sets the value of email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/** 
	 * Gets the value of email
	 */
	public String getEmail()
	{
		return email;
	}

	/** 
	 * Sets the value of salt
	 */
	public void setSalt(String salt)
	{
		this.salt = salt;
	}

	/** 
	 * Gets the value of salt
	 */
	public String getSalt()
	{
		return salt;
	}

	/** 
	 * Sets the value of password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/** 
	 * Gets the value of password
	 */
	public String getPassword()
	{
		return password;
	}

	/** 
	 * Sets the value of active
	 */
	public void setActive(String active)
	{
		this.active = active;
	}

	/** 
	 * Gets the value of active
	 */
	public String getActive()
	{
		return active;
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
		email = "";
		salt = "";
		password = "";
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
		
		// attempt to parse active
		try {
			short _parsed_active = Short.parseShort( active );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

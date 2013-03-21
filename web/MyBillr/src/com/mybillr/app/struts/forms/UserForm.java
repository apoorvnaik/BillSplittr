package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class UserForm extends ActionForm
{
	protected String id;

	protected String fname;

	protected String lname;

	protected String email;

	protected String phone;

	protected String salt;

	protected String password;

	protected String createdOn;

	protected String updatedOn;

	protected String lastLogged;

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
	 * Sets the value of fname
	 */
	public void setFname(String fname)
	{
		this.fname = fname;
	}

	/** 
	 * Gets the value of fname
	 */
	public String getFname()
	{
		return fname;
	}

	/** 
	 * Sets the value of lname
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
	}

	/** 
	 * Gets the value of lname
	 */
	public String getLname()
	{
		return lname;
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
	 * Sets the value of phone
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/** 
	 * Gets the value of phone
	 */
	public String getPhone()
	{
		return phone;
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
	 * Sets the value of createdOn
	 */
	public void setCreatedOn(String createdOn)
	{
		this.createdOn = createdOn;
	}

	/** 
	 * Gets the value of createdOn
	 */
	public String getCreatedOn()
	{
		return createdOn;
	}

	/** 
	 * Sets the value of updatedOn
	 */
	public void setUpdatedOn(String updatedOn)
	{
		this.updatedOn = updatedOn;
	}

	/** 
	 * Gets the value of updatedOn
	 */
	public String getUpdatedOn()
	{
		return updatedOn;
	}

	/** 
	 * Sets the value of lastLogged
	 */
	public void setLastLogged(String lastLogged)
	{
		this.lastLogged = lastLogged;
	}

	/** 
	 * Gets the value of lastLogged
	 */
	public String getLastLogged()
	{
		return lastLogged;
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
		fname = "";
		lname = "";
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
		
		// attempt to parse phone
		try {
			int _parsed_phone = Integer.parseInt( phone );
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse createdOn
		try {
			java.util.Date _parsed_createdOn = (createdOn == null || createdOn.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( createdOn);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse updatedOn
		try {
			java.util.Date _parsed_updatedOn = (updatedOn == null || updatedOn.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( updatedOn);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		// attempt to parse lastLogged
		try {
			java.util.Date _parsed_lastLogged = (lastLogged == null || lastLogged.trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( lastLogged);
		}
		catch (Exception e) {
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getMessage()) );
		}
		
		return _errors;
	}

}

package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class PasswordResetFindWhereResetHashEqualsForm extends ActionForm
{
	protected String resetHash;

	protected String crudMethod;

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

}

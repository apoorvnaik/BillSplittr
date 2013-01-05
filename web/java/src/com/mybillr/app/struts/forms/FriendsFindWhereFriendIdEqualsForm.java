package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class FriendsFindWhereFriendIdEqualsForm extends ActionForm
{
	protected String friendId;

	protected String crudMethod;

	/** 
	 * Sets the value of friendId
	 */
	public void setFriendId(String friendId)
	{
		this.friendId = friendId;
	}

	/** 
	 * Gets the value of friendId
	 */
	public String getFriendId()
	{
		return friendId;
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
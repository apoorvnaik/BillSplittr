package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class GroupMembersFindByGroupForm extends ActionForm
{
	protected String groupId;

	protected String crudMethod;

	/** 
	 * Sets the value of groupId
	 */
	public void setGroupId(String groupId)
	{
		this.groupId = groupId;
	}

	/** 
	 * Gets the value of groupId
	 */
	public String getGroupId()
	{
		return groupId;
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

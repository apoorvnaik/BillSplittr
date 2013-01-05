package com.mybillr.app.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.app.dto.*;

public class GeoipFindWhereEndEqualsForm extends ActionForm
{
	protected String end;

	protected String crudMethod;

	/** 
	 * Sets the value of end
	 */
	public void setEnd(String end)
	{
		this.end = end;
	}

	/** 
	 * Gets the value of end
	 */
	public String getEnd()
	{
		return end;
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

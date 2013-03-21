package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class Table1FindWhereSymbolEqualsForm extends ActionForm
{
	protected String symbol;

	protected String crudMethod;

	/** 
	 * Sets the value of symbol
	 */
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	/** 
	 * Gets the value of symbol
	 */
	public String getSymbol()
	{
		return symbol;
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

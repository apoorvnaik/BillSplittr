package com.mybillr.app.struts.actions;

import org.apache.struts.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.math.*;
import com.mybillr.app.dao.*;
import com.mybillr.app.dto.*;
import com.mybillr.app.factory.*;
import com.mybillr.app.struts.forms.*;

public class CurrenciesFindByPrimaryKeyAction extends Action
{
	/**
	 * Method 'execute'
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		try {
			// parse parameters
			short _id = Short.parseShort( request.getParameter("id") );
			java.lang.String _code = request.getParameter("code");
		
			// create the DAO class
			CurrenciesDao dao = CurrenciesDaoFactory.create();
		
			// execute the finder
			Currencies dto = dao.findByPrimaryKey(_id, _code);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			CurrenciesForm currenciesForm = new CurrenciesForm();
			currenciesForm.setCrudMethod( request.getParameter("crudMethod") );
			currenciesForm.setId(String.valueOf( dto.getId() ));
			currenciesForm.setCode(dto.getCode());
			currenciesForm.setCurrency(dto.getCurrency());
			currenciesForm.setCountry(dto.getCountry());
			// store the results
			request.getSession().setAttribute( "Currencies", currenciesForm );
		
			return mapping.findForward( crudMethod );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}

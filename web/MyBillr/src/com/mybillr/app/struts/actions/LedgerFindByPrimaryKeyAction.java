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

public class LedgerFindByPrimaryKeyAction extends Action
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
			int _id = Integer.parseInt( request.getParameter("id") );
			int _currency = Integer.parseInt( request.getParameter("currency") );
		
			// create the DAO class
			LedgerDao dao = LedgerDaoFactory.create();
		
			// execute the finder
			Ledger dto = dao.findByPrimaryKey(_id, _currency);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			LedgerForm ledgerForm = new LedgerForm();
			ledgerForm.setCrudMethod( request.getParameter("crudMethod") );
			ledgerForm.setId(String.valueOf( dto.getId() ));
			ledgerForm.setOwedBy(String.valueOf( dto.getOwedBy() ));
			ledgerForm.setOwesTo(String.valueOf( dto.getOwesTo() ));
			ledgerForm.setAmount(String.valueOf( dto.getAmount() ));
			ledgerForm.setCurrency(String.valueOf( dto.getCurrency() ));
			// store the results
			request.getSession().setAttribute( "Ledger", ledgerForm );
		
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

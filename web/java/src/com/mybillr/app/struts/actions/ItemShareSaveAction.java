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

public class ItemShareSaveAction extends Action
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
			// cast the form to the appropriate type
			ItemShareForm itemShareForm = (ItemShareForm) form;
		
			// create the DAO class
			ItemShareDao dao = ItemShareDaoFactory.create();
		
			ItemShare dto = new ItemShare();
			dto.setId( Integer.parseInt( itemShareForm.getId() ));
			dto.setItemId( Integer.parseInt( itemShareForm.getItemId() ));
			dto.setUserId( Integer.parseInt( itemShareForm.getUserId() ));
			dto.setShare( Integer.parseInt( itemShareForm.getShare() ));
		
			if (itemShareForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (itemShareForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (itemShareForm.getCrudMethod().equalsIgnoreCase("delete")) {
				dao.delete( dto.createPk() );
			}
		
			return mapping.findForward( "success" );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}

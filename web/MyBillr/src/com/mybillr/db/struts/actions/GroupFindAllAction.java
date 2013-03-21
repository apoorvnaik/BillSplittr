package com.mybillr.db.struts.actions;

import org.apache.struts.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.math.*;
import com.mybillr.db.dao.*;
import com.mybillr.db.dto.*;
import com.mybillr.db.factory.*;
import com.mybillr.db.struts.forms.*;

public class GroupFindAllAction extends Action
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
			// create the DAO class
			GroupDao dao = GroupDaoFactory.create();
		
			// execute the finder
			Group dto[] = dao.findAll();
		
			// store the results
			request.setAttribute( "result", dto );
		
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

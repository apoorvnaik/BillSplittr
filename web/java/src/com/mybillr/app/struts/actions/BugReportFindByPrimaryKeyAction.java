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

public class BugReportFindByPrimaryKeyAction extends Action
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
		
			// create the DAO class
			BugReportDao dao = BugReportDaoFactory.create();
		
			// execute the finder
			BugReport dto = dao.findByPrimaryKey(_id);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			BugReportForm bugReportForm = new BugReportForm();
			bugReportForm.setCrudMethod( request.getParameter("crudMethod") );
			bugReportForm.setId(String.valueOf( dto.getId() ));
			bugReportForm.setTitle(dto.getTitle());
			bugReportForm.setUserId(String.valueOf( dto.getUserId() ));
			bugReportForm.setMessage(dto.getMessage());
			bugReportForm.setReportedOn(dto.getReportedOn() == null ? null : DateFormat.getDateTimeInstance().format( dto.getReportedOn()));
			// store the results
			request.getSession().setAttribute( "BugReport", bugReportForm );
		
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

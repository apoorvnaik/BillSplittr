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

public class GroupsFindByPrimaryKeyAction extends Action
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
			java.lang.String _name = request.getParameter("name");
			int _memberId = Integer.parseInt( request.getParameter("memberId") );
		
			// create the DAO class
			GroupsDao dao = GroupsDaoFactory.create();
		
			// execute the finder
			Groups dto = dao.findByPrimaryKey(_id, _name, _memberId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			GroupsForm groupsForm = new GroupsForm();
			groupsForm.setCrudMethod( request.getParameter("crudMethod") );
			groupsForm.setId(String.valueOf( dto.getId() ));
			groupsForm.setName(dto.getName());
			groupsForm.setMemberId(String.valueOf( dto.getMemberId() ));
			// store the results
			request.getSession().setAttribute( "Groups", groupsForm );
		
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

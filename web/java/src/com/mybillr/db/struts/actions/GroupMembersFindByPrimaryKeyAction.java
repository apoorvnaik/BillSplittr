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

public class GroupMembersFindByPrimaryKeyAction extends Action
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
			int _groupId = Integer.parseInt( request.getParameter("groupId") );
			int _userId = Integer.parseInt( request.getParameter("userId") );
		
			// create the DAO class
			GroupMembersDao dao = GroupMembersDaoFactory.create();
		
			// execute the finder
			GroupMembers dto = dao.findByPrimaryKey(_groupId, _userId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			GroupMembersForm groupMembersForm = new GroupMembersForm();
			groupMembersForm.setCrudMethod( request.getParameter("crudMethod") );
			groupMembersForm.setGroupId(String.valueOf( dto.getGroupId() ));
			groupMembersForm.setUserId(String.valueOf( dto.getUserId() ));
			// store the results
			request.getSession().setAttribute( "GroupMembers", groupMembersForm );
		
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

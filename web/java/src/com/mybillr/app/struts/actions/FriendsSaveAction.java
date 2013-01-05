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

public class FriendsSaveAction extends Action
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
			FriendsForm friendsForm = (FriendsForm) form;
		
			// create the DAO class
			FriendsDao dao = FriendsDaoFactory.create();
		
			Friends dto = new Friends();
			dto.setUserId( Integer.parseInt( friendsForm.getUserId() ));
			dto.setFriendId( Integer.parseInt( friendsForm.getFriendId() ));
		
			if (friendsForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (friendsForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (friendsForm.getCrudMethod().equalsIgnoreCase("delete")) {
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

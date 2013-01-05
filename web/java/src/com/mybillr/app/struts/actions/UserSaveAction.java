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

public class UserSaveAction extends Action
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
			UserForm userForm = (UserForm) form;
		
			// create the DAO class
			UserDao dao = UserDaoFactory.create();
		
			User dto = new User();
			dto.setId( Integer.parseInt( userForm.getId() ));
			dto.setFname( userForm.getFname());
			dto.setLname( userForm.getLname());
			dto.setEmail( userForm.getEmail());
			dto.setPhone( Integer.parseInt( userForm.getPhone() ));
			dto.setSalt( userForm.getSalt());
			dto.setPassword( userForm.getPassword());
			dto.setCreatedOn( (userForm.getCreatedOn() == null || userForm.getCreatedOn().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( userForm.getCreatedOn()));
			dto.setUpdatedOn( (userForm.getUpdatedOn() == null || userForm.getUpdatedOn().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( userForm.getUpdatedOn()));
			dto.setLastLogged( (userForm.getLastLogged() == null || userForm.getLastLogged().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( userForm.getLastLogged()));
		
			if (userForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (userForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (userForm.getCrudMethod().equalsIgnoreCase("delete")) {
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

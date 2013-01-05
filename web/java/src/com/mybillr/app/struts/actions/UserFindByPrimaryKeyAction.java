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

public class UserFindByPrimaryKeyAction extends Action
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
			UserDao dao = UserDaoFactory.create();
		
			// execute the finder
			User dto = dao.findByPrimaryKey(_id);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			UserForm userForm = new UserForm();
			userForm.setCrudMethod( request.getParameter("crudMethod") );
			userForm.setId(String.valueOf( dto.getId() ));
			userForm.setFname(dto.getFname());
			userForm.setLname(dto.getLname());
			userForm.setEmail(dto.getEmail());
			userForm.setPhone(String.valueOf( dto.getPhone() ));
			userForm.setSalt(dto.getSalt());
			userForm.setPassword(dto.getPassword());
			userForm.setCreatedOn(dto.getCreatedOn() == null ? null : DateFormat.getDateTimeInstance().format( dto.getCreatedOn()));
			userForm.setUpdatedOn(dto.getUpdatedOn() == null ? null : DateFormat.getDateTimeInstance().format( dto.getUpdatedOn()));
			userForm.setLastLogged(dto.getLastLogged() == null ? null : DateFormat.getDateTimeInstance().format( dto.getLastLogged()));
			// store the results
			request.getSession().setAttribute( "User", userForm );
		
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

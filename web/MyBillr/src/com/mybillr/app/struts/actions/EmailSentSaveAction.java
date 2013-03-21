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

public class EmailSentSaveAction extends Action
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
			EmailSentForm emailSentForm = (EmailSentForm) form;
		
			// create the DAO class
			EmailSentDao dao = EmailSentDaoFactory.create();
		
			EmailSent dto = new EmailSent();
			dto.setId( Integer.parseInt( emailSentForm.getId() ));
			dto.setFrom( emailSentForm.getFrom());
			dto.setTo( emailSentForm.getTo());
			dto.setSubject( emailSentForm.getSubject());
			dto.setMessage( emailSentForm.getMessage());
			dto.setSentOn( (emailSentForm.getSentOn() == null || emailSentForm.getSentOn().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( emailSentForm.getSentOn()));
		
			if (emailSentForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (emailSentForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (emailSentForm.getCrudMethod().equalsIgnoreCase("delete")) {
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

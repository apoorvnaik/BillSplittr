<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>EmailSent</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="EmailSent" property="id" /></td>
</tr>
<tr>
<td>from:</td>
<td><bean:write name="EmailSent" property="from" /></td>
</tr>
<tr>
<td>to:</td>
<td><bean:write name="EmailSent" property="to" /></td>
</tr>
<tr>
<td>subject:</td>
<td><bean:write name="EmailSent" property="subject" /></td>
</tr>
<tr>
<td>message:</td>
<td><bean:write name="EmailSent" property="message" /></td>
</tr>
<tr>
<td>sentOn:</td>
<td><bean:write name="EmailSent" property="sentOn" /></td>
</tr>
</table>
<html:form action="EmailSentFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="EmailSentSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

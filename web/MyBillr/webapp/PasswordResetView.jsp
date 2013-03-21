<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>PasswordReset</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="PasswordReset" property="id" /></td>
</tr>
<tr>
<td>userId:</td>
<td><bean:write name="PasswordReset" property="userId" /></td>
</tr>
<tr>
<td>resetHash:</td>
<td><bean:write name="PasswordReset" property="resetHash" /></td>
</tr>
</table>
<html:form action="PasswordResetFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="PasswordResetSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

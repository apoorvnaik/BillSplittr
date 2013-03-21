<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>EmailsSent</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="EmailsSent" property="id" /></td>
</tr>
<tr>
<td>senderId:</td>
<td><bean:write name="EmailsSent" property="senderId" /></td>
</tr>
<tr>
<td>receiverId:</td>
<td><bean:write name="EmailsSent" property="receiverId" /></td>
</tr>
<tr>
<td>subject:</td>
<td><bean:write name="EmailsSent" property="subject" /></td>
</tr>
<tr>
<td>content:</td>
<td><bean:write name="EmailsSent" property="content" /></td>
</tr>
</table>
<html:form action="EmailsSentFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="EmailsSentSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

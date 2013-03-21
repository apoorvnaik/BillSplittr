<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>User</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="User" property="id" /></td>
</tr>
<tr>
<td>email:</td>
<td><bean:write name="User" property="email" /></td>
</tr>
<tr>
<td>salt:</td>
<td><bean:write name="User" property="salt" /></td>
</tr>
<tr>
<td>password:</td>
<td><bean:write name="User" property="password" /></td>
</tr>
<tr>
<td>active:</td>
<td><bean:write name="User" property="active" /></td>
</tr>
</table>
<html:form action="UserFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<html:hidden property="email" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="UserSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>User</h1>
<html:form action="UserSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false" size="30" /></td>
</tr>
<tr>
<td>email:</td>
<td><html:text property="email" readonly="false" size="30" /></td>
</tr>
<tr>
<td>salt:</td>
<td><html:text property="salt" readonly="false" size="30" /></td>
</tr>
<tr>
<td>password:</td>
<td><html:text property="password" readonly="false" size="30" /></td>
</tr>
<tr>
<td>active:</td>
<td><html:text property="active" readonly="false" size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

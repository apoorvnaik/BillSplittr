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
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>fname:</td>
<td><html:text property="fname" readonly="false"size="30" /></td>
</tr>
<tr>
<td>lname:</td>
<td><html:text property="lname" readonly="false"size="30" /></td>
</tr>
<tr>
<td>email:</td>
<td><html:text property="email" readonly="false"size="30" /></td>
</tr>
<tr>
<td>phone:</td>
<td><html:text property="phone" readonly="false"size="30" /></td>
</tr>
<tr>
<td>salt:</td>
<td><html:text property="salt" readonly="false"size="30" /></td>
</tr>
<tr>
<td>password:</td>
<td><html:text property="password" readonly="false"size="30" /></td>
</tr>
<tr>
<td>createdOn:</td>
<td><html:text property="createdOn" readonly="false"size="30" /></td>
</tr>
<tr>
<td>updatedOn:</td>
<td><html:text property="updatedOn" readonly="false"size="30" /></td>
</tr>
<tr>
<td>lastLogged:</td>
<td><html:text property="lastLogged" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Friends</h1>
<html:form action="FriendsSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>userId:</td>
<td><html:text property="userId" readonly="false"size="30" /></td>
</tr>
<tr>
<td>friendsWith:</td>
<td><html:text property="friendsWith" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>EmailsSent</h1>
<html:form action="EmailsSentSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>senderId:</td>
<td><html:text property="senderId" readonly="false"size="30" /></td>
</tr>
<tr>
<td>receiverId:</td>
<td><html:text property="receiverId" readonly="false"size="30" /></td>
</tr>
<tr>
<td>subject:</td>
<td><html:text property="subject" readonly="false"size="30" /></td>
</tr>
<tr>
<td>content:</td>
<td><html:text property="content" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

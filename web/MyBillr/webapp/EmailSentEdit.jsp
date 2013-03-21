<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>EmailSent</h1>
<html:form action="EmailSentSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>from:</td>
<td><html:text property="from" readonly="false"size="30" /></td>
</tr>
<tr>
<td>to:</td>
<td><html:text property="to" readonly="false"size="30" /></td>
</tr>
<tr>
<td>subject:</td>
<td><html:text property="subject" readonly="false"size="30" /></td>
</tr>
<tr>
<td>message:</td>
<td><html:text property="message" readonly="false"size="30" /></td>
</tr>
<tr>
<td>sentOn:</td>
<td><html:text property="sentOn" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>BugReportGeneral</h1>
<html:form action="BugReportGeneralSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>reportedBy:</td>
<td><html:text property="reportedBy" readonly="false"size="30" /></td>
</tr>
<tr>
<td>title:</td>
<td><html:text property="title" readonly="false"size="30" /></td>
</tr>
<tr>
<td>bug:</td>
<td><html:text property="bug" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

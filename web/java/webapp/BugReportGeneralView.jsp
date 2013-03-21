<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>BugReportGeneral</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="BugReportGeneral" property="id" /></td>
</tr>
<tr>
<td>reportedBy:</td>
<td><bean:write name="BugReportGeneral" property="reportedBy" /></td>
</tr>
<tr>
<td>title:</td>
<td><bean:write name="BugReportGeneral" property="title" /></td>
</tr>
<tr>
<td>bug:</td>
<td><bean:write name="BugReportGeneral" property="bug" /></td>
</tr>
</table>
<html:form action="BugReportGeneralFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="BugReportGeneralSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

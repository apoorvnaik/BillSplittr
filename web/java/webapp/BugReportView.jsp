<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>BugReport</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="BugReport" property="id" /></td>
</tr>
<tr>
<td>title:</td>
<td><bean:write name="BugReport" property="title" /></td>
</tr>
<tr>
<td>userId:</td>
<td><bean:write name="BugReport" property="userId" /></td>
</tr>
<tr>
<td>message:</td>
<td><bean:write name="BugReport" property="message" /></td>
</tr>
<tr>
<td>reportedOn:</td>
<td><bean:write name="BugReport" property="reportedOn" /></td>
</tr>
</table>
<html:form action="BugReportFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="BugReportSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

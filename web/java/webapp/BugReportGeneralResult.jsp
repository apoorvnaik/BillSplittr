<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
BugReportGeneral dto[] = (BugReportGeneral[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>reportedBy</td>
	<td>title</td>
	<td>bug</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	BugReportGeneral value = dto[i];
%>
<tr>
<td><a href="BugReportGeneralFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getReportedBy() %></td>
<td><%= value.getTitle() %></td>
<td><%= value.getBug() %></td>
</tr>
<%
}
%>
</table>

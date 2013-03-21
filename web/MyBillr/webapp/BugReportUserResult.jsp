<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
BugReportUser dto[] = (BugReportUser[]) request.getAttribute( "result" );
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
	BugReportUser value = dto[i];
%>
<tr>
<td><a href="BugReportUserFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getReportedBy() %></td>
<td><%= value.getTitle() %></td>
<td><%= value.getBug() %></td>
</tr>
<%
}
%>
</table>

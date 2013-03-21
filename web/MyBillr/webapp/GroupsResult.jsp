<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Groups dto[] = (Groups[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>name</td>
	<td>memberId</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Groups value = dto[i];
%>
<tr>
<td><a href="GroupsFindByPrimaryKeyResults.do?id=<%= value.getId() %>&name=<%= value.getName() %>&memberId=<%= value.getMemberId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><a href="GroupsFindByPrimaryKeyResults.do?id=<%= value.getId() %>&name=<%= value.getName() %>&memberId=<%= value.getMemberId() %>&crudMethod=view"><%= value.getName() %></a></td>
<td><a href="GroupsFindByPrimaryKeyResults.do?id=<%= value.getId() %>&name=<%= value.getName() %>&memberId=<%= value.getMemberId() %>&crudMethod=view"><%= value.getMemberId() %></a></td>
</tr>
<%
}
%>
</table>

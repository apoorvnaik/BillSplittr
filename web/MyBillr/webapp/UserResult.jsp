<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
User dto[] = (User[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>email</td>
	<td>salt</td>
	<td>password</td>
	<td>active</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	User value = dto[i];
%>
<tr>
<td><a href="UserFindByPrimaryKeyResults.do?id=<%= value.getId() %>&email=<%= value.getEmail() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><a href="UserFindByPrimaryKeyResults.do?id=<%= value.getId() %>&email=<%= value.getEmail() %>&crudMethod=view"><%= value.getEmail() %></a></td>
<td><%= value.getSalt() %></td>
<td><%= value.getPassword() %></td>
<td><%= value.getActive() %></td>
</tr>
<%
}
%>
</table>

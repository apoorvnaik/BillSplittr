<%@ page import="com.mybillr.app.dto.*" %>
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
	<td>fname</td>
	<td>lname</td>
	<td>email</td>
	<td>phone</td>
	<td>salt</td>
	<td>password</td>
	<td>createdOn</td>
	<td>updatedOn</td>
	<td>lastLogged</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	User value = dto[i];
%>
<tr>
<td><a href="UserFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getFname() %></td>
<td><%= value.getLname() %></td>
<td><%= value.getEmail() %></td>
<td><%= value.getPhone() %></td>
<td><%= value.getSalt() %></td>
<td><%= value.getPassword() %></td>
<td><%= value.getCreatedOn() %></td>
<td><%= value.getUpdatedOn() %></td>
<td><%= value.getLastLogged() %></td>
</tr>
<%
}
%>
</table>

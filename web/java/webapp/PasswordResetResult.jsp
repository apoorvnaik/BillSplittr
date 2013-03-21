<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
PasswordReset dto[] = (PasswordReset[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>userId</td>
	<td>resetHash</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	PasswordReset value = dto[i];
%>
<tr>
<td><a href="PasswordResetFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getUserId() %></td>
<td><%= value.getResetHash() %></td>
</tr>
<%
}
%>
</table>

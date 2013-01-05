<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
ItemShare dto[] = (ItemShare[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>itemId</td>
	<td>userId</td>
	<td>share</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	ItemShare value = dto[i];
%>
<tr>
<td><a href="ItemShareFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getItemId() %></td>
<td><%= value.getUserId() %></td>
<td><%= value.getShare() %></td>
</tr>
<%
}
%>
</table>

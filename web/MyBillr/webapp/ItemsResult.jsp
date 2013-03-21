<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Items dto[] = (Items[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>name</td>
	<td>participant</td>
	<td>price</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Items value = dto[i];
%>
<tr>
<td><a href="ItemsFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getName() %></td>
<td><%= value.getParticipant() %></td>
<td><%= value.getPrice() %></td>
</tr>
<%
}
%>
</table>

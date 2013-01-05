<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
SharedBill dto[] = (SharedBill[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>title</td>
	<td>participants</td>
	<td>paidBy</td>
	<td>items</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	SharedBill value = dto[i];
%>
<tr>
<td><a href="SharedBillFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getTitle() %></td>
<td><%= value.getParticipants() %></td>
<td><%= value.getPaidBy() %></td>
<td><%= value.getItems() %></td>
</tr>
<%
}
%>
</table>

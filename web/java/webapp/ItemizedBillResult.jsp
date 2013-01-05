<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
ItemizedBill dto[] = (ItemizedBill[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>paidBy</td>
	<td>items</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	ItemizedBill value = dto[i];
%>
<tr>
<td><a href="ItemizedBillFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getPaidBy() %></td>
<td><%= value.getItems() %></td>
</tr>
<%
}
%>
</table>

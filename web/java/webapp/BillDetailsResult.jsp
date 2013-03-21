<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
BillDetails dto[] = (BillDetails[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>billId</td>
	<td>userId</td>
	<td>itemName</td>
	<td>share</td>
	<td>amount</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	BillDetails value = dto[i];
%>
<tr>
<td><a href="BillDetailsFindByPrimaryKeyResults.do?billId=<%= value.getBillId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getBillId() %></a></td>
<td><a href="BillDetailsFindByPrimaryKeyResults.do?billId=<%= value.getBillId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getUserId() %></a></td>
<td><%= value.getItemName() %></td>
<td><%= value.getShare() %></td>
<td><%= value.getAmount() %></td>
</tr>
<%
}
%>
</table>

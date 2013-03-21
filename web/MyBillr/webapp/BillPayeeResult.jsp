<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
BillPayee dto[] = (BillPayee[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>billId</td>
	<td>userId</td>
	<td>share</td>
	<td>amount</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	BillPayee value = dto[i];
%>
<tr>
<td><a href="BillPayeeFindByPrimaryKeyResults.do?billId=<%= value.getBillId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getBillId() %></a></td>
<td><a href="BillPayeeFindByPrimaryKeyResults.do?billId=<%= value.getBillId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getUserId() %></a></td>
<td><%= value.getShare() %></td>
<td><%= value.getAmount() %></td>
</tr>
<%
}
%>
</table>

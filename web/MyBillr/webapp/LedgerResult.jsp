<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Ledger dto[] = (Ledger[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>owedBy</td>
	<td>owesTo</td>
	<td>amount</td>
	<td>currency</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Ledger value = dto[i];
%>
<tr>
<td><a href="LedgerFindByPrimaryKeyResults.do?id=<%= value.getId() %>&currency=<%= value.getCurrency() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getOwedBy() %></td>
<td><%= value.getOwesTo() %></td>
<td><%= value.getAmount() %></td>
<td><a href="LedgerFindByPrimaryKeyResults.do?id=<%= value.getId() %>&currency=<%= value.getCurrency() %>&crudMethod=view"><%= value.getCurrency() %></a></td>
</tr>
<%
}
%>
</table>

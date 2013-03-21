<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Debt dto[] = (Debt[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>owedBy</td>
	<td>owedTo</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Debt value = dto[i];
%>
<tr>
<td><a href="DebtFindByPrimaryKeyResults.do?id=<%= value.getId() %>&owedBy=<%= value.getOwedBy() %>&owedTo=<%= value.getOwedTo() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><a href="DebtFindByPrimaryKeyResults.do?id=<%= value.getId() %>&owedBy=<%= value.getOwedBy() %>&owedTo=<%= value.getOwedTo() %>&crudMethod=view"><%= value.getOwedBy() %></a></td>
<td><a href="DebtFindByPrimaryKeyResults.do?id=<%= value.getId() %>&owedBy=<%= value.getOwedBy() %>&owedTo=<%= value.getOwedTo() %>&crudMethod=view"><%= value.getOwedTo() %></a></td>
</tr>
<%
}
%>
</table>

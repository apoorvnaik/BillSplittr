<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Currencies dto[] = (Currencies[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>name</td>
	<td>symbol</td>
	<td>rate</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Currencies value = dto[i];
%>
<tr>
<td><a href="CurrenciesFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getName() %></td>
<td><%= value.getSymbol() %></td>
<td><%= value.getRate() %></td>
</tr>
<%
}
%>
</table>

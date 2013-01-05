<%@ page import="com.mybillr.app.dto.*" %>
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
	<td>code</td>
	<td>currency</td>
	<td>country</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Currencies value = dto[i];
%>
<tr>
<td><a href="CurrenciesFindByPrimaryKeyResults.do?id=<%= value.getId() %>&code=<%= value.getCode() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><a href="CurrenciesFindByPrimaryKeyResults.do?id=<%= value.getId() %>&code=<%= value.getCode() %>&crudMethod=view"><%= value.getCode() %></a></td>
<td><%= value.getCurrency() %></td>
<td><%= value.getCountry() %></td>
</tr>
<%
}
%>
</table>

<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Bill dto[] = (Bill[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>name</td>
	<td>total</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Bill value = dto[i];
%>
<tr>
<td><a href="BillFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getName() %></td>
<td><%= value.getTotal() %></td>
</tr>
<%
}
%>
</table>

<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
News dto[] = (News[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>content</td>
	<td>dated</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	News value = dto[i];
%>
<tr>
<td><a href="NewsFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getContent() %></td>
<td><%= value.getDated() %></td>
</tr>
<%
}
%>
</table>

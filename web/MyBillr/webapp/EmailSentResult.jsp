<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
EmailSent dto[] = (EmailSent[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>from</td>
	<td>to</td>
	<td>subject</td>
	<td>message</td>
	<td>sentOn</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	EmailSent value = dto[i];
%>
<tr>
<td><a href="EmailSentFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getFrom() %></td>
<td><%= value.getTo() %></td>
<td><%= value.getSubject() %></td>
<td><%= value.getMessage() %></td>
<td><%= value.getSentOn() %></td>
</tr>
<%
}
%>
</table>

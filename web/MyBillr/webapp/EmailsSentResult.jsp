<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
EmailsSent dto[] = (EmailsSent[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>senderId</td>
	<td>receiverId</td>
	<td>subject</td>
	<td>content</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	EmailsSent value = dto[i];
%>
<tr>
<td><a href="EmailsSentFindByPrimaryKeyResults.do?id=<%= value.getId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><%= value.getSenderId() %></td>
<td><%= value.getReceiverId() %></td>
<td><%= value.getSubject() %></td>
<td><%= value.getContent() %></td>
</tr>
<%
}
%>
</table>

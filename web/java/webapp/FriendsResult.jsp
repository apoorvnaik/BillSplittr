<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Friends dto[] = (Friends[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>userId</td>
	<td>friendId</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Friends value = dto[i];
%>
<tr>
<td><a href="FriendsFindByPrimaryKeyResults.do?userId=<%= value.getUserId() %>&friendId=<%= value.getFriendId() %>&crudMethod=view"><%= value.getUserId() %></a></td>
<td><a href="FriendsFindByPrimaryKeyResults.do?userId=<%= value.getUserId() %>&friendId=<%= value.getFriendId() %>&crudMethod=view"><%= value.getFriendId() %></a></td>
</tr>
<%
}
%>
</table>

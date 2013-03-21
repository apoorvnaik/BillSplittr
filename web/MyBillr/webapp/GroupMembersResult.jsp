<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
GroupMembers dto[] = (GroupMembers[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>groupId</td>
	<td>userId</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	GroupMembers value = dto[i];
%>
<tr>
<td><a href="GroupMembersFindByPrimaryKeyResults.do?groupId=<%= value.getGroupId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getGroupId() %></a></td>
<td><a href="GroupMembersFindByPrimaryKeyResults.do?groupId=<%= value.getGroupId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getUserId() %></a></td>
</tr>
<%
}
%>
</table>

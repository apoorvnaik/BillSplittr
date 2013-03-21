<%@ page import="com.mybillr.db.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
AccountActivation dto[] = (AccountActivation[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>id</td>
	<td>userId</td>
	<td>activationHash</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	AccountActivation value = dto[i];
%>
<tr>
<td><a href="AccountActivationFindByPrimaryKeyResults.do?id=<%= value.getId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getId() %></a></td>
<td><a href="AccountActivationFindByPrimaryKeyResults.do?id=<%= value.getId() %>&userId=<%= value.getUserId() %>&crudMethod=view"><%= value.getUserId() %></a></td>
<td><%= value.getActivationHash() %></td>
</tr>
<%
}
%>
</table>

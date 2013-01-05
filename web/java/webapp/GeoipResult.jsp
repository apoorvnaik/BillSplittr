<%@ page import="com.mybillr.app.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
Geoip dto[] = (Geoip[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>start</td>
	<td>end</td>
	<td>startInt</td>
	<td>endInt</td>
	<td>countrySymbol</td>
	<td>country</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	Geoip value = dto[i];
%>
<tr>
<td><%= value.getStart() %></td>
<td><%= value.getEnd() %></td>
<td><%= value.getStartInt() %></td>
<td><%= value.getEndInt() %></td>
<td><%= value.getCountrySymbol() %></td>
<td><%= value.getCountry() %></td>
</tr>
<%
}
%>
</table>

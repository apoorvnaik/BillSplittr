<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Geoip</h1>
<html:form action="GeoipSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>start:</td>
<td><html:text property="start" readonly="false"size="30" /></td>
</tr>
<tr>
<td>end:</td>
<td><html:text property="end" readonly="false"size="30" /></td>
</tr>
<tr>
<td>startInt:</td>
<td><html:text property="startInt" readonly="false"size="30" /></td>
</tr>
<tr>
<td>endInt:</td>
<td><html:text property="endInt" readonly="false"size="30" /></td>
</tr>
<tr>
<td>countrySymbol:</td>
<td><html:text property="countrySymbol" readonly="false"size="30" /></td>
</tr>
<tr>
<td>country:</td>
<td><html:text property="country" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

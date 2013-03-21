<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Geoip</h1>
<table class="bodyTable">
<tr>
<td>start:</td>
<td><bean:write name="Geoip" property="start" /></td>
</tr>
<tr>
<td>end:</td>
<td><bean:write name="Geoip" property="end" /></td>
</tr>
<tr>
<td>startInt:</td>
<td><bean:write name="Geoip" property="startInt" /></td>
</tr>
<tr>
<td>endInt:</td>
<td><bean:write name="Geoip" property="endInt" /></td>
</tr>
<tr>
<td>countrySymbol:</td>
<td><bean:write name="Geoip" property="countrySymbol" /></td>
</tr>
<tr>
<td>country:</td>
<td><bean:write name="Geoip" property="country" /></td>
</tr>
</table>
<html:form action="GeoipFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="GeoipSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

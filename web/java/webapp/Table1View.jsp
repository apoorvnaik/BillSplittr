<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Table1</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="Table1" property="id" /></td>
</tr>
<tr>
<td>name:</td>
<td><bean:write name="Table1" property="name" /></td>
</tr>
<tr>
<td>symbol:</td>
<td><bean:write name="Table1" property="symbol" /></td>
</tr>
<tr>
<td>rate:</td>
<td><bean:write name="Table1" property="rate" /></td>
</tr>
</table>
<html:form action="Table1FindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="Table1Save.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

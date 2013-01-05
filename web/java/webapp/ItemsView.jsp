<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Items</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="Items" property="id" /></td>
</tr>
<tr>
<td>name:</td>
<td><bean:write name="Items" property="name" /></td>
</tr>
<tr>
<td>participant:</td>
<td><bean:write name="Items" property="participant" /></td>
</tr>
<tr>
<td>price:</td>
<td><bean:write name="Items" property="price" /></td>
</tr>
</table>
<html:form action="ItemsFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="ItemsSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

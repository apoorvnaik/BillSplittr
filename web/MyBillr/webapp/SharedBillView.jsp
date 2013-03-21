<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>SharedBill</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="SharedBill" property="id" /></td>
</tr>
<tr>
<td>title:</td>
<td><bean:write name="SharedBill" property="title" /></td>
</tr>
<tr>
<td>participants:</td>
<td><bean:write name="SharedBill" property="participants" /></td>
</tr>
<tr>
<td>paidBy:</td>
<td><bean:write name="SharedBill" property="paidBy" /></td>
</tr>
<tr>
<td>items:</td>
<td><bean:write name="SharedBill" property="items" /></td>
</tr>
</table>
<html:form action="SharedBillFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="SharedBillSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

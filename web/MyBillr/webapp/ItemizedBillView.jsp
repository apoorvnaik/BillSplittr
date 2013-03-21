<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>ItemizedBill</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="ItemizedBill" property="id" /></td>
</tr>
<tr>
<td>paidBy:</td>
<td><bean:write name="ItemizedBill" property="paidBy" /></td>
</tr>
<tr>
<td>items:</td>
<td><bean:write name="ItemizedBill" property="items" /></td>
</tr>
</table>
<html:form action="ItemizedBillFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="ItemizedBillSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

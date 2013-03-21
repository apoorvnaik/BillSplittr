<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>BillDetails</h1>
<table class="bodyTable">
<tr>
<td>billId:</td>
<td><bean:write name="BillDetails" property="billId" /></td>
</tr>
<tr>
<td>userId:</td>
<td><bean:write name="BillDetails" property="userId" /></td>
</tr>
<tr>
<td>itemName:</td>
<td><bean:write name="BillDetails" property="itemName" /></td>
</tr>
<tr>
<td>share:</td>
<td><bean:write name="BillDetails" property="share" /></td>
</tr>
<tr>
<td>amount:</td>
<td><bean:write name="BillDetails" property="amount" /></td>
</tr>
</table>
<html:form action="BillDetailsFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="billId" />
<html:hidden property="userId" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="BillDetailsSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

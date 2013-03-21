<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>BillPayee</h1>
<table class="bodyTable">
<tr>
<td>billId:</td>
<td><bean:write name="BillPayee" property="billId" /></td>
</tr>
<tr>
<td>userId:</td>
<td><bean:write name="BillPayee" property="userId" /></td>
</tr>
<tr>
<td>share:</td>
<td><bean:write name="BillPayee" property="share" /></td>
</tr>
<tr>
<td>amount:</td>
<td><bean:write name="BillPayee" property="amount" /></td>
</tr>
</table>
<html:form action="BillPayeeFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="billId" />
<html:hidden property="userId" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="BillPayeeSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

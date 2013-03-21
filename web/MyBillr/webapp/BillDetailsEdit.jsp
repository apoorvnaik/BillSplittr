<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>BillDetails</h1>
<html:form action="BillDetailsSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>billId:</td>
<td><html:text property="billId" readonly="false" size="30" /></td>
</tr>
<tr>
<td>userId:</td>
<td><html:text property="userId" readonly="false" size="30" /></td>
</tr>
<tr>
<td>itemName:</td>
<td><html:text property="itemName" readonly="false" size="30" /></td>
</tr>
<tr>
<td>share:</td>
<td><html:text property="share" readonly="false" size="30" /></td>
</tr>
<tr>
<td>amount:</td>
<td><html:text property="amount" readonly="false" size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

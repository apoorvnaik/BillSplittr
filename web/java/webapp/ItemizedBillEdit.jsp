<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>ItemizedBill</h1>
<html:form action="ItemizedBillSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>paidBy:</td>
<td><html:text property="paidBy" readonly="false"size="30" /></td>
</tr>
<tr>
<td>items:</td>
<td><html:text property="items" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

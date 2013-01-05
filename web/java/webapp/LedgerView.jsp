<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Ledger</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="Ledger" property="id" /></td>
</tr>
<tr>
<td>owedBy:</td>
<td><bean:write name="Ledger" property="owedBy" /></td>
</tr>
<tr>
<td>owesTo:</td>
<td><bean:write name="Ledger" property="owesTo" /></td>
</tr>
<tr>
<td>amount:</td>
<td><bean:write name="Ledger" property="amount" /></td>
</tr>
<tr>
<td>currency:</td>
<td><bean:write name="Ledger" property="currency" /></td>
</tr>
</table>
<html:form action="LedgerFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<html:hidden property="currency" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="LedgerSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

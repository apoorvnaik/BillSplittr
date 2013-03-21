<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Debt</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="Debt" property="id" /></td>
</tr>
<tr>
<td>owedBy:</td>
<td><bean:write name="Debt" property="owedBy" /></td>
</tr>
<tr>
<td>owedTo:</td>
<td><bean:write name="Debt" property="owedTo" /></td>
</tr>
</table>
<html:form action="DebtFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<html:hidden property="owedBy" />
<html:hidden property="owedTo" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="DebtSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Currencies</h1>
<html:form action="CurrenciesSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>code:</td>
<td><html:text property="code" readonly="false"size="30" /></td>
</tr>
<tr>
<td>currency:</td>
<td><html:text property="currency" readonly="false"size="30" /></td>
</tr>
<tr>
<td>country:</td>
<td><html:text property="country" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

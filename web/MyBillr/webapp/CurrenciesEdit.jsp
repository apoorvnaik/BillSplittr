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
<td><html:text property="id" readonly="false" size="30" /></td>
</tr>
<tr>
<td>name:</td>
<td><html:text property="name" readonly="false" size="30" /></td>
</tr>
<tr>
<td>symbol:</td>
<td><html:text property="symbol" readonly="false" size="30" /></td>
</tr>
<tr>
<td>rate:</td>
<td><html:text property="rate" readonly="false" size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

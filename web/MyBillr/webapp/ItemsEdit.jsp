<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Items</h1>
<html:form action="ItemsSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>name:</td>
<td><html:text property="name" readonly="false"size="30" /></td>
</tr>
<tr>
<td>participant:</td>
<td><html:text property="participant" readonly="false"size="30" /></td>
</tr>
<tr>
<td>price:</td>
<td><html:text property="price" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

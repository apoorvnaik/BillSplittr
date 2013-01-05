<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>News</h1>
<html:form action="NewsSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>id:</td>
<td><html:text property="id" readonly="false"size="30" /></td>
</tr>
<tr>
<td>content:</td>
<td><html:text property="content" readonly="false"size="30" /></td>
</tr>
<tr>
<td>dated:</td>
<td><html:text property="dated" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

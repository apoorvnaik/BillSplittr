<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>GroupMembers</h1>
<html:form action="GroupMembersSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>groupId:</td>
<td><html:text property="groupId" readonly="false"size="30" /></td>
</tr>
<tr>
<td>userId:</td>
<td><html:text property="userId" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>

<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>GroupMembers</h1>
<table class="bodyTable">
<tr>
<td>groupId:</td>
<td><bean:write name="GroupMembers" property="groupId" /></td>
</tr>
<tr>
<td>userId:</td>
<td><bean:write name="GroupMembers" property="userId" /></td>
</tr>
</table>
<html:form action="GroupMembersFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="groupId" />
<html:hidden property="userId" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="GroupMembersSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

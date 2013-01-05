<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Groups</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="Groups" property="id" /></td>
</tr>
<tr>
<td>name:</td>
<td><bean:write name="Groups" property="name" /></td>
</tr>
<tr>
<td>memberId:</td>
<td><bean:write name="Groups" property="memberId" /></td>
</tr>
</table>
<html:form action="GroupsFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<html:hidden property="name" />
<html:hidden property="memberId" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="GroupsSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

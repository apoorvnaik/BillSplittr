<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>ItemShare</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="ItemShare" property="id" /></td>
</tr>
<tr>
<td>itemId:</td>
<td><bean:write name="ItemShare" property="itemId" /></td>
</tr>
<tr>
<td>userId:</td>
<td><bean:write name="ItemShare" property="userId" /></td>
</tr>
<tr>
<td>share:</td>
<td><bean:write name="ItemShare" property="share" /></td>
</tr>
</table>
<html:form action="ItemShareFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="ItemShareSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

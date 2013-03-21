<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>Friends</h1>
<table class="bodyTable">
<tr>
<td>userId:</td>
<td><bean:write name="Friends" property="userId" /></td>
</tr>
<tr>
<td>friendsWith:</td>
<td><bean:write name="Friends" property="friendsWith" /></td>
</tr>
</table>
<html:form action="FriendsFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="userId" />
<html:hidden property="friendsWith" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="FriendsSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

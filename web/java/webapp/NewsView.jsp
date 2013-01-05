<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>News</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="News" property="id" /></td>
</tr>
<tr>
<td>content:</td>
<td><bean:write name="News" property="content" /></td>
</tr>
<tr>
<td>dated:</td>
<td><bean:write name="News" property="dated" /></td>
</tr>
</table>
<html:form action="NewsFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="NewsSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

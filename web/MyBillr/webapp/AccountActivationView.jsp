<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>AccountActivation</h1>
<table class="bodyTable">
<tr>
<td>id:</td>
<td><bean:write name="AccountActivation" property="id" /></td>
</tr>
<tr>
<td>userId:</td>
<td><bean:write name="AccountActivation" property="userId" /></td>
</tr>
<tr>
<td>activationHash:</td>
<td><bean:write name="AccountActivation" property="activationHash" /></td>
</tr>
</table>
<html:form action="AccountActivationFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="id" />
<html:hidden property="userId" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="AccountActivationSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>

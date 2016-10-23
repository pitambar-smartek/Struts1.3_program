<%@ taglib uri="http://displaytag.sf.net" prefix="display"  %>
<html>
<body bgcolor="cyan">
<center>
<h1>Account Details</h1>
<display:table id="data" name="accounts" pagesize="3" requestURI="/account.do">
              <display:column property="accno" title="ACCNO" />
			  <display:column property="name" title="NAME" sortable="true" />
			  <display:column property="balance" title="BALANCE" sortable="true" />
</display:table>

</center>
</body>
</html>

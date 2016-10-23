
<%@taglib prefix="tiles"  uri="http://struts.apache.org/tags-tiles" %>
<html>
<body bgcolor="wheat">
            <table border="1" width="100%" height="100%">
<tr>
      <td colspan="2">
 <tiles:insert attribute="header" />
</td>
</tr>
<tr>
<td width="30%"><tiles:insert attribute="menu" /></td>
<td><tiles:insert attribute="body" /></td>
</tr>
<tr>
<td colspan="2"><tiles:insert attribute="footer" /></td>
</tr>
</table>
</body>
</html>
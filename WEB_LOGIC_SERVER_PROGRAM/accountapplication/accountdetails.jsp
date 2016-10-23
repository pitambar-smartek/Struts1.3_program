<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<html>
<body bgcolor="cyan">
Accno:<bean:write name="account" property="accno" /><br>
Name:<bean:write name="account" property="name" /><br>
Balance:<bean:write name="account" property="balance" /><br>
</body>
</html>

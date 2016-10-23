<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<body bgcolor="magenta">
<center>
<h1>Welcome to www.nareshit.com</h1>
<h2>Number Of times this page visited:<bean:write  name="counter" property="count" /></h2>

</center>
</body>
</html>

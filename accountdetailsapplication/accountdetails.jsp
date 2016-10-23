<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<html>
 <body bgcolor="yellow">
<center>
 <h1>Accout Details </h1>
Account NO:<bean:write name="account" property="accno" /><br>
Name::<bean:write name="account" property="name" /><br>
Balance<bean:write name="account" property="balance" /><br>
  </center>
 </body>
</html>

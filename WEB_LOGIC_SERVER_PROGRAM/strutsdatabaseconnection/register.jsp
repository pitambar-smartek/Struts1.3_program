<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="cyan">
<center>
<h1>WelCome to Rgistration Form</h1>
<html:form action="/reg" method="post" >
Name :<html:text property="name" /><br>
PassWord:<html:password property="password" /><br>
Emailid :<html:text property="emailid" /><br>
<html:submit>Register</html:submit>
</html:form>
</center>
</body>
</html>
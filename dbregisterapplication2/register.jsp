<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="orange">
<center>
<h1>Register Entry Screen</h1>
<html:form action="/register"  method="post" >
User Name::<html:text property="username"/><br><br>
Password::<html:password property="password" /><br><br>
Email Id::<html:text property="emailid" /><br><br>
<html:submit>register</html:submit>
</html:form>
</center>
</body>
</html>
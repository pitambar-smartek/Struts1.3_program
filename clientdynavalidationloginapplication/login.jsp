 <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<HTML>
<head>

<html:javascript formName="loginform" />

</head>
<body bgcolor="yellow">
 <center>
 <h1>Login Entry Screen</h1>
 <html:form action="login" method="post"  onsubmit="return validateLoginform(this);">

 User Name::<html:text property="username" />
<font color="red"><html:errors property="username" /></font>
<br><br>
Password:: <html:password property="password" />
<font color="red"><html:errors property="password" /></font>
<br><br>
<html:submit>login</html:submit>
</html:form>

 </center>
 </body>
 </HTML>
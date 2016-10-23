<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
 <body bgcolor="yellow">
 <center>
  <h1>Login Form</h1>
  <html:form action="/login" method="post" >
  UserName :<html:text property="username" />
  <br>
  Password :<html:password property="password" />
  <br>
  <html:submit>login</html:submit>
  </html:form>
 </center>
 <body>
</html>
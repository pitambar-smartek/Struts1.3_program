 <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<HTML>
<body bgcolor="yellow">
 <center>
 <h1>Login Entry Screen</h1>
 <html:form action="/login" method="post" >

 User Name::<html:text property="username" /><br><br>
Password:: <html:password property="password" /><br><br>
<html:submit>login</html:submit>
</html:form>

 </center>
 </body>
 </HTML>
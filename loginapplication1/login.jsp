 <%@ taglib prefix="s" uri="struts-tags" %>
<HTML>
<body bgcolor="cyan">
 <center>
 <h1>Login Entry Screen</h1>
 <s:form action="loginAction" >

 <s:textfield label="Name" name="username" />
<s:password label="password" name="password" />
<s:submit />
</s:form>

 </center>
 </body>
 </HTML>
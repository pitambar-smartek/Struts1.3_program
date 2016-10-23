<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="cyan">
<center>
 <h1>Account Retrieval Application</h1>
 <h3>Enter your account number</h3>
 <html:form action="account" >
 Account no:<html:text property="accno" /><br>
 <html:submit>Get Details Account</html:submit>
 </html:form>
</center>
</body>
</html>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="cyan">
<center>
 <h1>Account Retrieval Application</h1>
 <h3>Due to the balance Range you retrive the data </h3>
 <html:form action="account" >
 Account no:<html:text property="balance" /><br>
 <html:submit>Get Details Information</html:submit>
 </html:form>
</center>
</body>
</html>
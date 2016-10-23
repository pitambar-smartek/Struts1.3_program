<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="orange">
<center>
<h1>Register Entry Screen1</h1>
<html:form action="/register2"  method="post" >
Proffessional::<html:text property="professional"/><br><br>
Mobile No::<html:password property="mobileno" /><br><br>
Accept<html:checkbox property="agree" /><br><br>
<html:submit>register</html:submit>
</html:form>
</center>
</body>
</html>
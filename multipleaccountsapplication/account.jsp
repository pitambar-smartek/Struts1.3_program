<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="orange">
<center>
<h1>Account Number Entry Screen</h1>
<html:form action="account"  >
Balance Range::<html:text property="balrange" value=" " /><br><br>

<html:submit>Get Accounts</html:submit>
</html:form>
</center>
</body>
</html>
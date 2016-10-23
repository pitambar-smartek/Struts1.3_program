<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="orange">
<center>
<h1>Account Number Entry Screen</h1>
<html:form action="account"  >
AccNo::<html:text property="accno" value=" " /><br><br>

<html:submit>AccountDetails</html:submit>
</html:form>
</center>
</body>
</html>
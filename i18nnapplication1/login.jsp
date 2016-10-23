 <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
 <%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<HTML>
<body bgcolor="yellow">
 <center><br><br/>
 <html:link href="changelocale.do?language=en&country=US&page=/show.do">English</html:link>
 <html:link href="changelocale.do?language=it&page=/show.do">Italian</html:link>

 <bean:message key="welcome.message" /><br><br>
 <html:form action="login" method="post" >

  <bean:message key="username" /><html:text property="username" /><br>
  <font color="red" size="4"><html:errors property="username" /></font><br>
 <bean:message key="password" /> <html:password property="password" />
<font color="red" size="4"> <html:errors property="password" /></font><br><br>
<html:submit><bean:message key="register.submit" /></html:submit>
</html:form>

 </center>
 </body>
 </HTML>
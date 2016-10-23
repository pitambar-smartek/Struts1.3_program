<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
     <body bgcolor="cyan">
	     <h1>Welcome to register page</h1>
<html:form action="register1" method="post">
  Name::<html:text property="name" value=" "/><br><br>
  Password::<html:text property="password" value=" " /><br><br>

  Proffession::<html:select property="profession">
                              <html:option value="Engineer">Engineer</html:option>
							  <html:option value="Teacher">Teacher</html:option>
							  <html:option value="Doctor">Doctor</html:option>
							  <html:option value="Student">Student</html:option>
							  <html:option value="Other">other</html:option>
				  </html:select>

  <html:submit>Register</html:submit>  
</html:form>
</center></body></html>
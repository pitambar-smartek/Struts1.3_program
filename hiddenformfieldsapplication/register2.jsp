<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
     <body bgcolor="cyan">
	  <center>
	    <h1>Please fill the following things to complete the Registration</h1>
    
	<html:form action="register2" method="post">
	    <html:hidden property="name" write="registerForm.name" />
		  <html:hidden property="password" write="registerForm.password" />
		    <html:hidden property="profession" write="registerForm.profession" />

	Cell::<html:text property="cell" /><br><br>
	Gender::<html:radio property="gender" value="male">Male</html:radio>
	Gender::<html:radio property="gender" value="female">FeMale</html:radio>
	<html:checkbox property="agree" />I agree the terms and conditions of this registration<br><br>
	<html:submit>Complet Registration</html:submit>
</html:form>
	  </center>
	  </body>
      </html>
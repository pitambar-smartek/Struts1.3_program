<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<html:javascript formName="userForm" />
 
</head>
 <body bgcolor="yellow" >
 <center>
  <h1>Login Form</h1>
  <div style="color:red">
    
  </div>
  <html:form action="/login" method="post" onsubmit="return validateUserForm(this);">
  
   
   DATE::<html:text property="date" />
     <html:errors property="date" /><br>
 EmailId::  <html:text property="emailId" />
     <html:errors property="emailId" /><br>
    
Range::   <html:text property="range" />
     <html:errors property="range" /><br>

	 Name::   <html:text property="name" />
     <html:errors property="name" /><br>
	 Proffession::<html:select property="profession">
	                           <html:option value=" ">value</html:option>
                              <html:option value="Engineer">Engineer</html:option>
							  <html:option value="Teacher">Teacher</html:option>
							  <html:option value="Doctor">Doctor</html:option>
							  <html:option value="Student">Student</html:option>
							  <html:option value="Other">other</html:option>
				  </html:select>
	 <html:errors property="profession" /><br>

	 Gender::<html:radio property="gender" value="male">Male</html:radio>
	                 <html:radio property="gender" value="female">FeMale</html:radio>
					<html:errors property="gender" /><br>

					<html:checkbox property="agree" />I agree the terms and conditions of this registration	
					 <html:errors property="agree" /><br>

					 Age::   <html:text property="age" />
     <html:errors property="age" /><br>

  <html:submit>login</html:submit>
  </html:form>
 </center>
 <body>
</html>
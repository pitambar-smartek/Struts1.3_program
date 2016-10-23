
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %> 
<html>
    <body>
	    <center>
		     <h1>Opening An Account Entry screen</h1>
			 <html:form action="open" method="post">
			AccountNO:: <html:text property="accno" value=" " />
			 Name::<html:text property="name" value=" " />
			Balance:: <html:text property="balance" value=" " />
			 <html:submit>openaccount</html:submit>
			 </html:form>
		 </center>
	</body>
</html>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
    <body>
	    <center>
		     <h1>WithDrawing  Entry screen</h1>
			 <html:form action="/withdraw" method="post" >
			     Account NO::<html:text property="accno" value=" " />
				 Amount::<html:text property="amount" value=" " />
				 <html:submit>withdrawmoney</html:submit>
			 </html:form>
			 	 </center>
	</body>
</html>
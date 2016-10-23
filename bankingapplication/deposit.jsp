<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
    <body>
	    <center>
		     <h1>depositing  Entry screen</h1>
			 <html:form action="/deposit" method="post">
			 AccountNo::<html:text property="accno" value=" " />
			 Amount::<html:text property="amount" value=" " />
			 <html:submit>DepositAmount</html:submit>
			 </html:form>
			  </center>
	</body>
</html>
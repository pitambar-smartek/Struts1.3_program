<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
<body bgcolor="wheat">
<center>
<h1>Employee removal service</h1>
        <html:form action="remove" method="post">
		EmployeeNo<html:text property="empno" value=""/><br>
		            <input type="submit"  value="delete" />
					</html:form>
					</center>
					</body>
					</html:html>
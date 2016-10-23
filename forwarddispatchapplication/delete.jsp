<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
<body bgcolor="wheat">
<center>
<h1>Employee removal service</h1>
        <html:form action="both" method="post">
		EmployeeNo<html:text property="empno" value=""/><br>
		            <input type="submit" name="admin" value="delete" />
					</html:form>
					</center>
					</body>
					</html:html>
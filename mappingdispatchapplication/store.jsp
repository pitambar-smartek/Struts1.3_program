<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
<body>
<center>
<html:form action="store" method="post">
     <h1>Employee Details Entry Screen</h1>
       Employee No::<html:text property="empno" value="" /><br/><br/>
       Employee Name::<html:text property="name" value="" /><br/><br/>
       Employee Salary::<html:text property="salary" value="" /><br/><br/>

     <input type="submit" name="emp" value="insert" />

</html:form>
</center>
</body>
</html:html>
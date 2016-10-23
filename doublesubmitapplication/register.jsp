<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html><body bgcolor="cyan">
<center>
  <h1>Registration Screen</h1>
  <html:form action="/registerAction">
  Name<html:text property="name" /><br><br>

  <input type="submit" name="usr" value="register" />
  </html:form>
  </center>
  </body>
  </html>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html>
 <body bgcolor="orange">
<center>
 <h1>Accout Details </h1>
<Table border="1" bordercolor="blue" ><tr><th>AccNo</th>
                    <th>Name</th>
                     <th>Balance</th>
              </tr>
<logic:iterate scope="request" name="accounts" id="account" >
<tr> 
      

    <td><bean:write name="account" property="accno" /></td>
    <td><bean:write name="account" property="name" /></td>
     <td><bean:write name="account" property="balance" /></td>



</tr>
</logic:iterate>
</table>
  </center>
 </body>
</html>

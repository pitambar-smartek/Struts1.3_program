<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<html>
    <body bgcolor="green">
	  <h1>Your Shopping Cart Items</h1>
	  <h2>
	  <logic:iterate scope="request" name="products" id="product" >
	     Product Code:::<bean:write name="product" property="pcode" />
		 Quantity::<bean:write name="product" property="quantity" /><br><br>
		 </logic:iterator>
		 </h2>
		 <html:link action="shoppingpage">Home</html:link>
		 
	</body>
</html>
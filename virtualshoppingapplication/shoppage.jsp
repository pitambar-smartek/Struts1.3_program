<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<body bgcolor="wheat">
     <center>
<h2>Welcome To Shooping</h1>
<html:form action="shopping">
 SELECT PRODUCT CODE
 <html:select property="pcode">
 <html:option value="p101">p101</html:option>
  <html:option value="p102">p102</html:option>
   <html:option value="p103">p103</html:option>
    <html:option value="p104">p104</html:option>
	 <html:option value="p105">p105</html:option>
	 </html:select><br><br>
	 PRODUCT QNT<html:text property="quantity" value="" />
	 <br><br>
	 <html:submit property="submit" value="ADDITEM" />
	 <html:submit property="submit" value="REMOVEITEM" />
	 <html:submit property="submit" value="SHOWITEM" />
	 <html:submit property="submit" value="LOGOUT" />
	             </html:form>

		</center>
		</body>
		</html>
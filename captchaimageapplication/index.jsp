<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Captcha</title>
<link rel="stylesheet" href="style.css">
</head>
<body bgcolor="cyan">

<center>
<h1>WELCOME TO  PANDA LOGIN PAGE</h1>
<form method="post">
<table cellspacing="15">
<tr>
<td>Name</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Message</td>
<td> <textarea type="text" cols="25" rows="8" name="message"></textarea></td>
</tr>

<tr>
<td>plz enter the captcha value?</td>
<td><input type="text" name="code"></td>
</tr>

</table>

<br>
<img src="./captcha"> 

<br><br>
<input type="submit" value="submit">

</form>
<br><br>
<%
  String captcha = (String) session.getAttribute("captcha");
  String code = (String) request.getParameter("code");

  if (captcha != null && code != null) {

    if (captcha.equals(code)) {
	  out.print("<p class='alert'>Correct</p>");
    } else {
          out.print("<p class='alert'>Incorrect</p>");
    }
  }
%>
</center>
</body>
</html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Login form by Deepu</title>
</head>
<body>
  <form:form name ="submitForm" method ="POST">
  
  <div align ="center">
  <table>
  <tr>
  <td> User Name</td>
  <td><input type="text" name ="userName"/></td>
  </tr>
  <tr>
  <td>Password</tr>
  <td><input type ="password" name ="password"/></td>
  </tr>
  <tr>
  <td></tr>
  <td><input type ="submit" name ="Submit"/></td>
  </tr>
  </table>
  <div style ="" color:red">${error }</div>
  </div>  
  </form:form>
</body>
</html>
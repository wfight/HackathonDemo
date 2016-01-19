<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello,World!
<%="Hello,World." %>
<s:property value="username"/>

<table >
<tr>
    <td >Name</td>
    <td>Password</td>
</tr>
<s:iterator value = "testList" id = "info">
<tr>
     <td>${info.name}</td> 
    <td><s:textfield name = "info.id">${info.id}</s:textfield ></td>
</tr>
</s:iterator>
 
 
</table>
</body>
</html>
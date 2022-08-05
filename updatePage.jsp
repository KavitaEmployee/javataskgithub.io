<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <h1>Employee Edit Form</h1>
<form action="UpdateNewData">
       Id : <input type="text" name="id" value="${emp.id}" readonly/><br><br>
       Name : <input type="text" name="name" value="${emp.name}"><br><br>
       Last : <input type="text" name="last"  value="${emp.last}"><br><br>
       <input type="submit" value="Submit">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Last</th>
</tr>
<c:forEach items="${emp}" var="employee">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.last}</td>
<td><a href="deleteData?id=${employee.id}">Delete</a></td>
<td><a href="updateData?id=${employee.id}">Update</a></td>
</tr>
</c:forEach>

<a href="home">Home Page</a>
</table>
   
</body>
</html>
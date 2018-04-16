<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<h2>All Users</h2>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}

</style>
<table>
	<tr>
		<th>User Id</th>
		<th>User Name</th>
		<th>Address</th>
		<th>Mobile</th>
		<th>Email</th>
		<th>Action</th>
	</tr>
		<c:forEach items="${ALL_USER_LIST}" var="user">
	<tr>
   			<td>${user.userId}</td>
   			<td>${user.userName}</td>
   			<td>${user.address}</td>
   			<td>${user.mobileNumber}</td>
   			<td>${user.eMail}</td>
   			<td><a href="updateUser?userId=${user.userId}"><span class="glyphicon glyphicon-pencil"></span></a></td>
	</tr>
		</c:forEach>


</table>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>


<table>
<thead>
<tr>
	<th>아이디</th>
	<th>이름</th>
	<th>이메일</th>
</tr>
</thead>
<tbody>
<c:forEach var="user" items="${users}">
<tr>
	<td>${user.loginId}</td>
	<td>${user.name}</td>
	<td>${user.email}</td>
</tr>
</c:forEach>
</tbody>
</table>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../include/header.jsp" %>
<meta charset="EUC-KR">
<title>user list</title>
</head>
<body>
	<c:forEach var="userlist" items="${userlist}">
		${userlist.email}
		${userlist.pw}
		${userlist.name}
		${userlist.number}
		${userlist.gender}
		${userlist.birth_date}
	</c:forEach>
</body>
</html>
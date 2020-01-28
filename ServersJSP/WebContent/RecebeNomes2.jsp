<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= "Nome recebido: " + request.getParameter("nome")%>
<p/>
<%= "Contexto: " + request.getContextPath()%>
<p/>
<%= "Endereço local: " + request.getLocalAddr()%>
<p/>
<%session.getAttribute("curso"); %>
</body>
</html>
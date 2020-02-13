<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String nome = "nome recebido com out.print: " + request.getParameter("nome");
out.print(nome); 
%> <!-- (com out.print) request é utilizado para receber parâmetros, no caso, recebe o parâmetro nome dado no arquivo Index -->
<p/>
<%=
"nome recebido sem out.print: " + request.getParameter("nome")
%> <!-- (sem out.print) request é utilizado para receber parâmetros, no caso, recebe o parâmetro nome dado no arquivo Index -->
<p/>
<%= session.getAttribute("Curso") %> <!--  Obtem os dados de atributo de sessão passados lá no Index -->

<%@ page isErrorPage="true" %> <!-- Define que sera mostrado o erro nesta pagina -->
<%= exception %>
</body>
</html>
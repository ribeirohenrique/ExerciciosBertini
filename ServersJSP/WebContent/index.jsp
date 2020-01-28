<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1> Bem vindo ao curso de JSP</h1>
	<%= "Insira um nome" %>
		
		<form action="RecebeNomes.jsp">
			<input type="text" id="nome" name="nome">
			<input type="submit" value="Enviar"></input>
		</form>
		
	<%! int cont = 2; 
		public int retorna(int n){
			return n * 3;
		}
	%>
	
<%= "Valor inserido: " + cont%>
<br/>
<%= "Valor inserido * 3: " + retorna (8)%>
<br/>
<%= "O Estado é: " + application.getInitParameter("estado")%>
<%session.setAttribute("curso", "Curso de JSP"); %>
		
</body>
</html>
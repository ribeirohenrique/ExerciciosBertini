<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Bem vindo ao curso de JSP</h1>
	<% out.print("Teste do servidor JSP com out.print"); %> <!-- Texto para exibição na tela com out.print -->
<br>
	<%= "Teste do servidor JSP sem out.print" %> <!-- Texto para exibição na tela sem out.print -->
<br>	
	<form action="receber-nome.jsp"> <!--  Esta tag envia os dados recebidos no "send" para outra página, no caso, receber-nome -->
		<input type="text" id="nome" name="nome">
		<input type="submit" value="Enviar"></input>
	</form>
<br>
	<%! 
	int cont = 2; 
	public int retorna(int n){
		return n * 3;
	}
	%>
	<%= "valor 'cont' definido: " + cont %>
<br>
	<%= "valor 'retorna * 3' definido: " + retorna(8) %>
<br>
	<%= application.getInitParameter("estado")%> <!--  Busca la no XML o parametro estado, feito isso ele retorna o valor definido -->
<br>
	<% session.setAttribute("Curso", "Curso de JSP"); %> <!-- Define um atributo de sessao, podendo ser consultado em todas as paginas -->
<br>
	<%@ page import="java.util.Date" %> <!-- Directiva para importar classes, neste caso a de data e hora -->
<br>
	<%= "data de hoje --> " + new Date() %> <!--  Mostra a data atual -->
<p/>
	<%@ page errorPage="receber-nome.jsp" %> <!--  Emite um erro na pagina caso seja feita a ação abaixo 100/0 -->

	<%@ include file="pagina-include.jsp" %> <!-- Insercao de uma pagina dentro da outra -->
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Pessonagem Cadastrado</title>
	</head>
	
	<body>
		<h2>Cadastro de Personagem</h2>

		<p>O seguinte personagem foi cadastrado com sucesso:</p>
		
		<% 
		String nome = request.getParameter("nome");
		char sexo = request.getParameter("sexo").charAt(0);
		String pais = request.getParameter("pais");
		
		int chuteForte = Integer.parseInt(request.getParameter("chuteForte"));
		int chuteFraco = Integer.parseInt(request.getParameter("chuteFraco"));
		int socoForte = Integer.parseInt(request.getParameter("socoForte"));
		int socoFraco = Integer.parseInt(request.getParameter("socoFraco"));
		
		String nomeMagia = request.getParameter("magia");
		String descricao = request.getParameter("descricao");
		int potencia = Integer.parseInt(request.getParameter("potencia"));
		
		%>
		
		<Fieldset><legend>Personagem</legend><p>
		Nome:: <%=nome %><br />
		Sexo: <%=sexo %><br />
		País: <%=pais %>
		</p></Fieldset>
		
		<Fieldset><legend>Golpes</legend><p>
		Chute Fraco: <%=chuteFraco %><br />
		Chute Forte: <%=chuteForte %><br />
		Soco Fraco: <%=socoFraco %><br />
		Soco Forte: <%=socoForte %>
		</p></Fieldset>
		
		<Fieldset><legend>Mágia</legend><p>
		Nome da Mágia: <%=nomeMagia %><br />
		Descrição: <%=descricao%><br />
		Potência: <%=potencia %>
		</p></Fieldset>
	</body>
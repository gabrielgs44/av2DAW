<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
	<meta charset="UTF-8">
	<title>Cadastro de Personagens</title>
	</head>	
		
	<body>
		<h2>Cadastro de Personagem</h2>
		<form action="CadastroPersonagem" method="post">
		
		<fieldset>
			<legend>Cadastro de Personagem</legend>
			<p><label for="nome">Nome:</label>
			<input type="text" id='nome' name="nome"></p>
			
			<p><label for="sexo">Sexo:</label><input type="radio" name="sexo" id="sexo" value="M"> Masculino 
			<input type="radio" name="sexo" id="sexo" value="F"> Feminino</p>
			
			<p><label for="pais">País:</label>
			<select name="pais" id="pais"size=1>
			<option>Brasil </option>
			<option>Japão </option>
			<option>Bolivia </option>
			 <option>Argentina </option>
			 <option>EUA </option>
			</select>
		</fieldset>

		<fieldset><legend>Golpes</legend>Potência		<p><label for="chuteFraco">Chute Fraco:</label>
			1 <input type="range" name="chuteFraco" id="chuteFraco" min="1" max="5" step="1"> 5 
			</p>

			<p><label for="chuteForte">Chute Fore:</label>
			6 <input type="range" name="chuteForte" id="chuteForte" min="6" max="10" step="1"> 10 
			</p>

			<p><label for="socoFraco" >Soco Fraco:</label>
			1 <input type="range" name="socoFraco" id="socoFraco" min="1" max="5" step="1"> 5 
			</p>

			<p><label for="socoForte" >Soco Forte:</label>
			6 <input type="range" name="socoForte" id="socoForte" min="6" max="10" step="1"> 10 
			</p>
		</fieldset>

			<fieldset>
				<legend>Mágia</legend>
				<p><label for="magia">Nome da Magia:</label>
				<input type="text" id='magia' name="magia"></p>

				<p><label for="descricao">Descrição:</label><textarea name="descricao" id="descricao" rows="10" cols="40"></textarea>

				<p><label for="potencia">Potência:</label><select name="potencia" id="potencia" size=1>
				<option>500 </option>
				<option>1000 </option>
				<option>2000 </option>
				<option>3000 </option>
				<option>4000 </option>
				<option>5000 </option>
				</select></p>
			<p><input type="submit" value="Cadastrar" /></p>
			</fieldset>
		</form>
	</body>
</html>
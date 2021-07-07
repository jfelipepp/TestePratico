<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contato");

	
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Movimentações</title>
<!-- Mobile Specific Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- Font-->
<link rel="stylesheet" type="text/css" href="montserrat-font.css">
<link rel="stylesheet" type="text/css"
	href="material-design-iconic-font.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- Main Style Css -->
<link rel="stylesheet" href="style.css" />
</head>
<body class="form-v10">
	<div class="page-content">
		<div class="form-v10-content">
			<form class="form-detail" >
				<div class="form-left">
					<h2>Movimentações</h2>
					<h2>
						<a class="btn btn-primary btn-lg" href="novo.html" role="button">Novo
						</a>
					</h2>
				</div>
			</form>

			<table class="table">
				<thead>
					<tr>
						<th>Cliente</th>
						<th>Tipo</th>
						<th>Status</th>
						<th>Conteiner</th>
						<th>Categoria</th>
						<th>Movimentação</th>
						<th>Hora de Inicio</th>
						<th>Hora Final</th>
						<th>Data de Inicio</th>
						<th>Data de Fim</th>
					</tr>
				</thead>
				<tbody>
					<%for (int i = 0; i < lista.size(); i++) { %>
						
						<tr>
						<td><%=lista.get(i).getCliente()%></td>
						<td><%=lista.get(i).getTipo()%></td>
						<td><%=lista.get(i).getStatus()%></td>
						<td><%=lista.get(i).getNumconteiner()%></td>
						<td><%=lista.get(i).getCategoria()%></td>
						<td><%=lista.get(i).getMovimentacao()%></td>
						<td><%=lista.get(i).getHorainicio()%></td>
						<td><%=lista.get(i).getHorafim()%></td>
						<td><%=lista.get(i).getDatainicio()%></td>
						<td><%=lista.get(i).getDatafim()%></td>
					</tr>
		
					<%} %>
				</tbody>
			</table>


		</div>
	</div>
</body>
</html>
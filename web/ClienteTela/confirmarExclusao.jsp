<%-- 
    Document   : confirmarExclusao
    Created on : 16/07/2021, 00:11:39
    Author     : laert
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Sistema Beibe</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">
</head>

<body>

	<jsp:include page="/resources/templates/navbar.jsp" />

	<!-- Begin page content -->
	<div class="container">
		<div class="page-header">
			<h1>Confirmar Exclusão do Cliente</h1>
		</div>

	</main>
	<div class="col-sm-8">
		<ul class="list-group">
			<li class="list-group-item list-group-item-info"> Código: ${item.id}</li>
			<li class="list-group-item list-group-item-info"> Nome: ${item.nome}</li>
			<li class="list-group-item list-group-item-info"> CPF : ${item.cpf}</li>
			<li class="list-group-item list-group-item-info"> Email : ${item.email}</li>
			<li class="list-group-item list-group-item-info"><fmt:formatDate type="date" pattern="dd/MM/yyyy"
					value="${item.dataNasc}" /></li>
		</ul>

	</div>
	
	<div class="col-sm-offset-2 col-sm-10">
		<a href="${pageContext.request.contextPath}/cliente/excluir?cod=${item.id}" class="btn btn-danger"> Excluir</a>
		<a href="${pageContext.request.contextPath}/cliente/listar" class="btn btn-default"> Voltar</a>
	</div>

	<jsp:include page="/resources/templates/footer.jsp"></jsp:include>

	<!-- Bootstrap core JavaScript -->

	<script src="${pageContext.request.contextPath}/resources/js/jquery-min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>


<%-- 
    Document   : erro
    Created on : 15/07/2021, 21:31:05
    Author     : laert
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html lang="pt_br">
<head>
<meta charset="ISO-8859-1">


<title>Sistema Beibe</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/sticky-footer-navbar/">

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<link
	href="${pageContext.request.contextPath}/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">

</head>

<body>

	<header>
		<!-- Fixed navbar -->
		<jsp:include page="/resources/templates/navbar.jsp"></jsp:include>
	</header>

	<!-- Begin page content -->
	<main role="main" class="container">
		<h1 class="mt-5">Ocorreu um Erro!!!</h1>
		
	</main>


	<p class="lead"> ${msg}</p>
	<jsp:include page="/resources/templates/footer.jsp"></jsp:include>

	<!-- Bootstrap core JavaScript -->

	<script src="${pageContext.request.contextPath}/resources/js/jquery-min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>

<%-- 
    Document   : index.jsp
    Created on : 13/07/2021, 16:47:10
    Author     : laert
--%>


<%
  // Validar se usuário está logado
  if (session.getAttribute("login") == null) {
    try {
      request.setAttribute("msg", " Por favor, Logar antes Arrombado!");
      request.setAttribute("cor", "danger");
      request.getRequestDispatcher("index.jsp").forward(request, response);
      return;
    } catch (ServletException e) {}
  }
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html lang="pt_br">
<head>
<meta charset="ISO-8859-1">


<title> Sistema BeiBe </title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/sticky-footer-navbar/">

<!-- Bootstrap core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">

<link
	href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">

</head>

<body>

	<header>
		<!-- Fixed navbar -->
		<jsp:include page="/resources/templates/navbar.jsp"></jsp:include>
	</header>

        
         <h3 class="mb-5 fade-in then text-primary">
          Bem-vindo, ${login.nomeUsuario}!
        </h3>
        
	<div>
	</div>
	

	<jsp:include page="/resources/templates/footer.jsp"></jsp:include>
        
        
         <div id="form-footer fade-in then" style="margin-top:3rem;">
          Em caso de problemas, contate-nos:<br>
          <a href="mailto:${configuracao.emailAdmin}" class="underline-hover">
            ${configuracao.emailAdmin}
          </a>
        </div>

	<!-- Bootstrap core JavaScript -->

	<script src="<%=request.getContextPath()%>/resources/js/jquery-min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>


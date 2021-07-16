<%-- 
    Document   : lista
    Created on : 14/07/2021, 02:37:19
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
        <title> Sistema BEIBE !</title>
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
                <h1>Clientes</h1>
            </div>

            <div class="row">
                <div class="col-sm-2">
                    <form class="navbar-form" action="${pageContext.request.contextPath}/cliente/novo">
                        <button type="submit" class="btn btn-primary">Inserir novo</button>
                    </form>
                </div>
                <div class="col-sm-6">
                    <form class="navbar-form" action="${pageContext.request.contextPath}/cliente/filtrar">
                        <div class="form-group">
                            <input type="text" name="busca" placeholder="Digite um nome" class="form-control"/>
                        </div>
                        <button type="submit" class="btn btn-success">Filtrar</button>
                    </form>
                </div>
            </div>

            <table class="table">
                <thead>
                    <tr>
                        <th> Id</th>
                        <th> Nome</th>
                        <th> Cpf</th>
                        <th> Email</th>
                        <th> Data Nascimento</th>
                        <th> Ação</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${itens}" var="x">
                        <tr>
                            <td>${x.id}</td>
                            <td>${x.nome}</td>
                            <td>${x.cpf}</td>
                            <td>${x.email}</td>
                            <td><fmt:formatDate type="date" pattern="dd/MM/yyyy" value="${x.dataNasc}"/></td>
                            <td><a href="${pageContext.request.contextPath}/cliente/editar?id=${x.id}" class="btn btn-primary btn-xs">Editar</a>
                                <a href="${pageContext.request.contextPath}/cliente/remover?id=${x.id}" class="btn btn-danger btn-xs">Excluir</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <jsp:include page="/resources/templates/footer.jsp"></jsp:include>

            <!-- Core JS -->
            <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
        <script
        src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    </body>
</html>

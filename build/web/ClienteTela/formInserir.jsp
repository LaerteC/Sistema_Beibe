<%-- 
    Document   : formInserir
    Created on : 15/07/2021, 21:16:29
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
        <title>Sistema de Beibe</title>
        <link
            href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
            rel="stylesheet">
        <link
            href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css"
            rel="stylesheet">
    </head>

    <body>

        <jsp:include page="/resources/templates/navbar.jsp" />


        <!-- Begin page content -->

        <h2 class="mt-5" style="margin-left:100px;"> Inserir Novo Cliente </h2>





        <form method="post" name="myform" class="form-horizontal" action="<%=request.getContextPath()%>/cliente/inserir">

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <ul>
                        <c:forEach items="${erros}" var="msg">
                            <li class="erro"  style="color: #FF0000;
                                font-weight: bold;">${msg}</li>
                            </c:forEach>
                    </ul>

                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2  control-label" for="nome" > Nome :</label>

                <div class="col-sm-5">
                    <input type="text" name="nome" id="nome" value="${item.nome}" required="required" class="form-control" />
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2  control-label" for="cpf" > CPF :</label>

                <div class="col-sm-5">
                    <input type="text" name="cpf" id="cpf" value="${item.cpf}" required="required" class="form-control" />
                </div>
            </div>


            <div class="form-group">
                <label class="col-sm-2  control-label" for="email" > Email:</label>

                <div class="col-sm-5">
                    <input type="text" name="email" id="email" value="${item.email}" required="required" class="form-control" />
                </div>
            </div>


            <div class="form-group">
                <label class="col-sm-2 control-label" for="dataNasc"> Data de Nascimento:</label>
                <div class="col-sm-5">
                    <input type="text" name="dataNasc" id="nascimento"
                           value="<fmt:formatDate pattern="dd/MM/yyyy" value="${item.dataNasc}"/>"
                           required="required" class="form-control" />
                </div>
               <!-- <div class="col-12 col-md-10 form-inline">
                <label for="tickets-report" class="my-1 mr-2" style="font-weight:unset;"></label>
              <input type="date" id="tickets-report-from" class="form-control mb-2 mr-sm-2" value="${item.dataNasc}" name="dataNasc" required />
            </div>-->
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2" col-sm-10>
                    <button  type="submit"  class="btn btn-primary"> Inserir 
                    </button>
                    <a href="${pageContext.request.contextPath}/cliente/listar"  class="btn btn-default"> Voltar bolas </a>
                </div>
            </div>

        </form>
        <jsp:include page="/resources/templates/footer.jsp"></jsp:include>

            <!-- Bootstrap core JavaScript -->

            <script src="${pageContext.request.contextPath}/resources/js/jquery-min.js"></script>
        <script
        src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    </body>
</html>

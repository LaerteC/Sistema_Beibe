<%-- 
    Document   : index
    Created on : 16/07/2021, 00:33:28
    Author     : laert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>
     Sistema Beibe
    </title>
    
    <link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
    
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/window-down.css"
  </head>
  <body>
      
     
    <div class="wrapper fade-in-down">
      <div class="form-content">
        <div class="my-3 fade-in then">
          <img src="${pageContext.request.contextPath}/img/logo.png" style="width:220px; padding-top: 10px" id="icon" alt="Ícone do sistema" />
        <span class="text-white-50 h4 c-title" style="font-family: 'Slabo 40px', serif;font-size: 40px"> BeibeCare</span>
        </div>
        
        
        
        <% if (request.getAttribute("msg") != null) { %>
          <div class="alert alert-${cor} border-${cor}">
            ${msg}
          </div>
        <% } %>
        
        
        
        <form action="${pageContext.request.contextPath}/cliente/login" method="POST">
          <input
            type="text"
            id="user"
            class="fade-in then"
            placeholder="Nome"
            name="login"
            required autofocus
          />
          <input
            type="password"
            id="password"
            class="fade-in then"
            placeholder="Senha"
            name="senha"
            required
          />
          <button
            type="submit"
            class="fade-in then"
          >Login</button>
        </form>
        <div id="form-footer fade-in then">
          Em caso de problemas, contate-nos:<br>
          <a href="mailto:${configuracao.emailAdmin}" class="underline-hover">
            laerte-netoo@outlook.com 
          </a>
        </div>
      </div>
    </div>
  </body>
</html>

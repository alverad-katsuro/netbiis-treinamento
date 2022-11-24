<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/png" href="https://cdn.albertoroura.com/media/2014/05/html5_logo.png"/>
    <link rel="stylesheet" href="assets/css/bulma.min.css">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <script src="assets/js/bootstrap.min.js"></script>
    
    <title>Loja Virtual</title>
</head>
<body>
    <%@ include file="shared/navbar.html" %>
    <script src="assets/js/collapse_navbar.js"></script>

    <div class="card">
        <header class="card-header">
          <p class="card-header-title text">
            Bem vindo ao sistema de gerenciamento da loja virtual.
          </p>
          <button class="card-header-icon" aria-label="more options">
            <span class="icon">
              <i class="fas fa-angle-down" aria-hidden="true"></i>
            </span>
          </button>
        </header>
        <div class="card-content">
          <div class="content">
            Escolha uma das opções abaixo.
          </div>
        </div>
        <footer class="card-footer">
          <a href="/webapp/clientes" class="card-footer-item">Clientes</a>
          <a href="/webapp/cursos" class="card-footer-item">Cursos</a>
          <a href="/webapp/pagamentos" class="card-footer-item">Pagamentos</a>
        </footer>
      </div>
    
</body>
</html>
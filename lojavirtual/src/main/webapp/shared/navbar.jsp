<link rel="stylesheet" href="http://localhost:8080/LojaVirtual/assets/css/bulma.min.css">
<nav class="navbar is-link" role="navigation" aria-label="main navigation">
  <div class="navbar-brand">
    <a class="navbar-item" href="/LojaVirtual">
      <img src="http://localhost:8080/LojaVirtual/assets/images/loja.png" width="112" height="28">
    </a>

    <a role="button" class="navbar-burger" aria-label="menu" aria-expanded="false" data-target="nav-links">
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
    </a>
  </div>

  <div id="nav-links" class="navbar-menu">
    <div class="navbar-start">
      <% boolean login=Boolean.parseBoolean((String) session.getAttribute("login")); 
        if(login) { 
          out.println("<a class='navbar-item' href='/LojaVirtual/clientes/index.jsp'>Clientes</a>");
          out.println("<a class='navbar-item' href='/LojaVirtual/cursos/index.jsp'>Cursos</a>");
          out.println("<a class='navbar-item' href='/LojaVirtual/pagamentos/index.jsp'>Pagamentos</a>");
        }
      %>
    </div>

    <div class="navbar-end">
      <div class="navbar-item">
        <div class="buttons">
          <% 
            if(login) { 
              out.println("<a class='button is-light' href='http://localhost:8080/LojaVirtual/logout'>Sair</a>");
            } else {
              out.println("<a class='button is-primary' href='http://localhost:8080/LojaVirtual/login'><strong>Login</strong></a>");
            }
            %>
        </div>
      </div>
    </div>
  </div>
</nav>
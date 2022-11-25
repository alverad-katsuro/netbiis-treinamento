<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <html>

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://localhost:8080/LojaVirtual/assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="http://localhost:8080/LojaVirtual/assets/js/bootstrap.min.js"></script>
    <link href="http://localhost:8080/LojaVirtual/assets/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://localhost:8080/LojaVirtual/assets/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link rel="icon" type="image/png" href="https://cdn.albertoroura.com/media/2014/05/html5_logo.png" />
    <link href="http://localhost:8080/LojaVirtual/assets/css/padrao.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="http://localhost:8080/LojaVirtual/assets/css/bulma.min.css">
  </head>
  <title>Página de Autenticação</title>

  <body>
    <jsp:include page="shared/navbar.jsp"></jsp:include>

    <div class="section">
      <div class="container">
        <div class="row">
          <section class="hero is-fullheight">
            <div class="hero-body">
              <div class="container">
                <div class="columns is-centered">
                  <div class="column is-5-tablet is-4-desktop is-3-widescreen">
                    <form class="box" role="form" action="http://localhost:8080/LojaVirtual/login" method="post">
                      <div class="field">
                        <label for="" class="label">Email</label>
                        <div class="control has-icons-left">
                          <input type="email" name="email" placeholder="e.g. bobsmith@gmail.com" class="input" required>
                          <span class="icon is-small is-left">
                            <i class="fa fa-envelope"></i>
                          </span>
                        </div>
                      </div>
                      <div class="field">
                        <label for="" class="label">Password</label>
                        <div class="control has-icons-left">
                          <input type="password" name="password" placeholder="*******" class="input" required>
                          <span class="icon is-small is-left">
                            <i class="fa fa-lock"></i>
                          </span>
                        </div>
                      </div>
                      <div class="field">
                        <button class="button is-success">
                          Login
                        </button>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </section>

        </div>
      </div>
    </div>
    <footer>
      <div class="navbar navbar-fixed-bottom bgred">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 text-center" style="top:13px;color:#fff;">� ABCTreinamentos - Curso de Java 8 para Web
            </div>
          </div>
        </div>
      </div>
    </footer>
  </body>

  </html>
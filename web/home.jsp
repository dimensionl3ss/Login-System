<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
      integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
      integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"
      integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/"
      crossorigin="anonymous"
    ></script>
    <title>Home</title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">Login System </a>

        <div class="collapse navbar-collapse" id="navbarText">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
            </li>
          </ul>
          <!-- </span> -->
        </div>
        <div class="dropdown show">
          <a
            class="btn btn-default dropdown-toggle"
            role="button"
            id="user"
            data-toggle="dropdown"
            aria-haspopup="true"
            aria-expanded="false"
          >
            My Profile
          </a>

          <div class="dropdown-menu" aria-labelledby="user">
            <a class="dropdown-item" href="<%=request.getContextPath()%>/Logout">Log out</a>
          </div>
        </div>
      </div>
    </nav>

    <center>
      <% 
              String user = null;
              response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
              response.setHeader("Progma", "no-cache");
              response.setHeader("Expires", "0");
              if (session != null) {
                  user = session.getAttribute("name").toString();
                  if (session.getAttribute("name") != null) {
                      out.print("Hello, " + session.getAttribute("name") + " Welcome to your Profile");
                  } else {
                      response.sendRedirect("login.html");
                  }
            }else response.sendRedirect("login.html");
      %>
    </center>
    <script>
      document.getElementById("user").innerHTML = "<%=user %>";
    </script>
  </body>
</html>

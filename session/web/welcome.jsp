<%@page import="ma.projet.entity.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!-- Ajout des liens CDN de Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

        <!-- Ajout du CDN de Font Awesome pour les icônes -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">

        <style>
            .center-content {
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
                min-height: 100vh;
            }
            .logout-button {
                position: absolute;
                top: 10px;
                right: 10px;
            }
        </style>
    </head>
    <body>
        <div class="container center-content">
            <%! Client c;%>
            <%
                if (session == null) {
                    response.sendRedirect("auth.jsp");
                } else {
                    c = (Client) session.getAttribute("client");
                }
            %>
            <h1>
                Welcome : <%= c.getNom()%>
            </h1>
        </div>
        <div class="container">
            <a class="logout-button btn btn-danger" href="Deconnexion">
                <i class="fas fa-sign-out-alt"></i> Déconnexion
            </a>
        </div>
    </body>
</html>

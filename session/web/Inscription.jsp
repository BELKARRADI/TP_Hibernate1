<%-- 
    Document   : Inscription
    Created on : 10 oct. 2023, 11:54:45
    Author     : Lachgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
            <form action="Inscription" method="POST">
                <fieldset>
                    <legend>Inscription </legend>
                    <table class="table">
                        <tr>
                            <td>Nom </td>
                            <td><input type="text" name="nom" class="form-control" value="" required></td>
                        </tr>
                        <tr>
                            <td>Prénom  </td>
                            <td><input type="text" name="prenom" class="form-control" value="" required></td>
                        </tr>
                        <tr>
                            <td>Email  </td>
                            <td><input type="text" name="email" class="form-control" value="" required></td>
                        </tr>
                        <tr>
                            <td>Mot de passe </td>
                            <td><input type="password" name="password" class="form-control" value="" required></td>
                        </tr>
                        <tr>
                            <td>Date  </td>
                            <td><input type="date" name="date" class="form-control" value="" required></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td style="text-align: center;">
                                <input type="submit" class="btn btn-primary" value="Valider">
                                <input class="btn btn-primary" style="width: 120PX;" value="Se Connecter" href="auth.jsp" onclick="window.location.href = 'auth.jsp';">
                            </td>
                        </tr>

                    </table>
                </fieldset>
            </form>
        </div>
    </body>
</html>

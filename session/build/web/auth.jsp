<%-- 
    Document   : auth
    Created on : 10 oct. 2023, 12:10:57
    Author     : Lachgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!-- Add CDN links for Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
            <form action="Auth" method="POST">
                <fieldset>
                    <legend style=" margin-left: 205px" >Connexion</legend>
                    <table class="table">
                        <tr>
                            <td>Email</td>
                            <td><input type="text" name="email" class="form-control" value=""></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>Mot de passe</td>
                            <td><input type="password" name="password" class="form-control" value=""></td>
                            <td></td>

                        </tr>
                        <tr>
                            <td><input style="width: 120px; " type="submit" class="btn btn-primary" value="Connect"></td>
                            <td><input style="width: 140px; margin-left: 30px" class="btn btn-primary" value="S'inscrire" href="Inscription.jsp" onclick="window.location.href = 'Inscription.jsp';"></td>
                            <td><input style="width: 180px; " class="btn btn-primary" value="Mot de passe Oublié" href="MotDePasse.jsp" onclick="window.location.href = 'MotDePasse.jsp';"></td>

                        </tr>

                        <tr>
                            <td></td>
                            <td>
                                <h3>${msg}</h3>
                            </td>
                            <td></td>

                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
       
    </body>
</html>

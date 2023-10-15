<%-- 
    Document   : RandomInt
    Created on : 12 oct. 2023, 19:22:04
    Author     : ADMIN
--%>


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
    </head>
    <body>
        <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
            <form action="RecupMdp" method="POST">
                <fieldset>
                    <legend>Récupération Mot de passe </legend>
                    <table class="table">
                        <tr>
                            <td>Entrez le code Reçu </td>
                            <td><input type="text" name="code" class="form-control" value=""></td>
                            <td><input type="submit" class="btn btn-primary" value="Envoyer"></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <h3>${msg}</h3>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
    </body>
</html>

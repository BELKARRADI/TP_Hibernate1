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
            <form action="ModifierPass" method="POST">
                <fieldset>
                    <legend>Modification de mot de passe </legend>
                    <table class="table">
                        <tr>
                            <td>Nouveau Mot De Passe </td>
                            <td><input id="password1" type="password" name="code" class="form-control" value=""></td>
                            <td><input id="password2" type="password" name="Mdp" class="form-control" value=""></td>
                            <td><input id="submitBtn" type="submit" class="btn btn-primary" value="Envoyer" disabled></td>
                        </tr>
                    </table>
                </fieldset>
            </form>

            <script>
                document.getElementById("password1").addEventListener("input", checkPasswords);
                document.getElementById("password2").addEventListener("input", checkPasswords);

                function checkPasswords() {
                    var password1 = document.getElementById("password1").value;
                    var password2 = document.getElementById("password2").value;
                    var submitBtn = document.getElementById("submitBtn");

                    if (password1 === password2) {
                        submitBtn.removeAttribute("disabled");
                    } else {
                        submitBtn.setAttribute("disabled", "true");
                    }
                }
            </script>
        </div>
    </body>
</html>

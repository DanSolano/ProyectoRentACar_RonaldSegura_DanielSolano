<%-- 
    Document   : index
    Created on : 16/10/2017, 03:24:07 PM
    Author     : Ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sistema Renta de Vehiculos</title>
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <div id="login">
            <form action= "Login" method="POST">
                <label>Usuario: </label>
                <input type="text" name="user" placeholder="Ingrese su nombre de usuario"/><br>
                <label>Contraseña: </label>
                <input type="password" name="password" placeholder="Ingrese su contraseña"/><br><br>
                <input type="submit" value="Enviar"/>
            </form>
        </div>
    </body>
</html>

<%-- 
    Document   : ingresarUsuario
    Created on : 17/10/2017, 12:37:14 PM
    Author     : Ronald
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Renta de Vehiculos</title>
    </head>
    <body>
        <div>
            <form action="./ServletUsuario" method="GET">
                
                <input type="hidden" name="accion" value="Ingresar">
                
                <label>Ingrese la identificacion del usuario: </label>
                <input type="text" name="idUser"/><br>
                <label>Ingrese el nombre del usuario: </label>
                <input type="text" name="nombreUser"/><br>
                <label>Ingrese los apellidos del usuario: </label>
                <input type="text" name="apellidosUser"/><br>
                <label>Ingrese la provincia del usuario: </label>
                <input type="text" name="provinciaUser"/><br>
                <label>Ingrese el canton del usuario: </label>
                <input type="text" name="cantonUser"/><br>
                <label>Ingrese el distrito del usuario: </label>
                <input type="text" name="distritoUser"/><br>
                <label>Ingrese el correo electronico del usuario: </label>
                <input type="text" name="emailUser"/><br>
                <label>Ingrese el telefono del usuario: </label>
                <input type="text" name="telefonoUser"/><br>
                <label>Ingrese la fecha de registro del usuario: </label>
                <input type="text" name="fechaRegistroUser"/><br>
                <br>
                <input type="submit" value="Enviar"/>
            </form>
        </div>
    </body>
</html>


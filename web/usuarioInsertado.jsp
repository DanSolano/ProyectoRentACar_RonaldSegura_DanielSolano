<%-- 
    Document   : usuarioInsertado
    Created on : 19/10/2017, 05:03:48 PM
    Author     : Ronald
--%>

<%@page import="Dominio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar nuevo parque nacional</title>
    </head>
    <body>
        <h1>Datos del usuario ingresado</h1>
        <% Usuario usuario = (Usuario) request.getAttribute("usuarioRecibido");%>
        <b> Cedula: <%= usuario.getCedula()%> </b><br>
        <b> Nombre: <%= usuario.getNombre()%> </b><br>
        <b> Apellidos: <%= usuario.getApellidos()%> </b><br>
        <b> Provincia: <%= usuario.getProvincia()%> </b><br>
        <b> Canton: <%= usuario.getCanton()%> </b><br>
        <b> Distrito: <%= usuario.getDistrito()%> </b><br>
        <b> Correo Electronico: <%= usuario.getCorreoElectronico()%> </b><br>
        <b> Fecha de registro: <%= usuario.getFechaRegistro()%> </b><br>
        <br>
        <br>
        <br>
        <a href="ingresarUsuario.jsp">< Ingresar otro usuario</a> <br>
        <a href="ingresarUsuario.jsp"><< Realizar mantenimiento de usuarios</a> <br>
        <a href="menuPrincipal.jsp"><<< Volver al menu principal</a>
    </body>
</html>

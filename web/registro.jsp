<%-- 
    Document   : registro
    Created on : 23 jul. 2023, 13:03:05
    Author     : kevlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
        <style>
            body{
                background: orange;
                font-family: Helvetica;
            }
        </style>
        
    </head>
    <body>
        <h1>Formulario de registro</h1>
        <form action="nuevousuario" method="post">
         Usuario: <br><input type="text" name="usuario"/><br>
         Nombre: <br><input type="text" name="nombre"/><br>
         Apellido: <br><input type="text" name="apellido"/><br>
         Edad: <br><input type="text" name="edad"/><br>
         Sexo: <br><input type="text" name="sexo"/><br>
         Contraseña: <br><input type="password" name="pass"/><br>
          <br><input type="submit" value="Registrarme"/><br>
        </form>
    </body>
</html>

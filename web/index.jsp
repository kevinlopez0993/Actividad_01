<%-- 
    Document   : login
    Created on : 23 jul. 2023, 12:31:27
    Author     : kevlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
        <script src="js/main.js"></script>      
        <style>
            body{
                background: greenyellow;
                font-family: Helvetica;
            }
        </style>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form action="iniciar" method="post" id="forminicio">
            
            Usuario: <br><input type="text" name="usuario" id="txtusuario"/><br>
            Contraseña: <br><input type="text" name="pass" id="txtpass"/><br>
             <br><input type="button" value="Iniciar Sesion" id="btniniciar"/><br>
        </form>
        <br>
       ¿No tienes cuenta? <a href="registro.jsp">Registrate</a>
    </body>
</html>

<%-- 
    Document   : menu
    Created on : 23 jul. 2023, 14:19:53
    Author     : kevlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession objsesion = request.getSession(false);
    String usuario = (String)objsesion.getAttribute("usuario");
    if(usuario.equals("")){
         response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <style>
            body{
                background: orange;
                font-family: Helvetica;
            }
        </style>
    </head>
    <body>
        <h1>Hola usuario <% out.println(usuario);%> tu acceso fue correcto</h1>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h3>Calcula tu IMC</h3>
        <br/>
        <form action="IMCServlet" method="post">
            <table >
                <tr>
                    <td>Peso (kg)</td>
                    <td><input type="text" name="peso" /></td>
                </tr>  
                <tr>
                    <td>Altura (m)</td>
                    <td><input type="text" name="altura" /></td>
                </tr> 
                <tr>
                    <td></td>
                    <td><input type="submit" value="Calcular" /></td>
                </tr> 
            </table>
        </form>
    </body>
</html>
   

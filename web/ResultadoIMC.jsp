<%-- 
    Document   : ResultadoIMC
    Created on : 23 jul. 2023, 17:57:03
    Author     : kevlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <body>
        <h3>El resultado de</h3>
        <br/>
        <%float imc = Float.parseFloat(request.getAttribute("imc").toString());%>
        
        <% if(imc==0) {%>
       
        <h3>Los campos no fueron llenados</h3>
        <br/>
        <p><a href="menu.jsp">Volver</a></p>
        <% }else{ %>
        
        <p>tu IMC es <%= imc%> </p>
        <% if (imc < 18.5) {%>
        <p style="background-color:red ">Bajo de peso</p>
        <%} else if (imc >= 18.5 && imc < 24.9) { %>
        <p style="background-color:green ">Peso normal</p>
        <%} else if (imc >= 25 && imc < 29.9) { %>
        <p style="background-color:yellow ">Sobrepeso</p>
        <%} else if (imc >= 30 && imc < 39.9) { %>
        <p style="background-color:orange ">Obesidad II</p>
        <%} else {%>
        <p style="background-color:black ">
            <font style="color: white">Obesidad III</font></p>
        <% }
        } %>
        <br/>
          <p><a href="menu.jsp">Volver</a></p>
          <a href="index.jsp">Regresar a pagina de inicio</a>
    </body>
</html>

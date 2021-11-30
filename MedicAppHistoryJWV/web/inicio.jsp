<%-- 
    Document   : inicio.jsp
    Created on : 26/11/2021, 01:35:55 AM
    Author     : jhan_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ControladorConsulta" method="GET">
            <label for="sintomas">Síntomas</label>
            <input type="textarea" id="sintomas" name="sintomas"/>
            <label for="diagnostico">Diagnóstico</label>
            <input type="textarea" id="diagnostico" name="diagnostico"/>
            <label for="medicacion">Medicación</label>
            <input type="textarea" id="medicacion" name="medicacion"/>
            <label for="presion">Presión Arterial</label>
            <input type="text" id="presion" name="presion"/>
            <label for="temperatura">Temperatura</label>
            <input type="number" id="temperatura" name="temperatura"/>
            <label for="costo">Costo</label>
            <input type="number" id="costo" name="costo"/>

            <button id="envio">Guardar Consulta</button>
        </form>
    </body>
</html>

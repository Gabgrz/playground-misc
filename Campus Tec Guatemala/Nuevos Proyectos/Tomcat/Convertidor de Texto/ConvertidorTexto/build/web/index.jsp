<%-- 
    Document   : newjsp
    Created on : 26/11/2017, 09:16:30 PM
    Author     : gab12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Convertidor de Texto</title>
        <link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
    <body>
    <div class="grid">
    <center><h1 style="margin-bottom: 1px">Desplazador de Texto</h1>
        <img style="width: 100px" src="http://d16lujqpoi2r3g.cloudfront.net/2016/03/20074250/passolo-glossary-converter.png">
        <br><br>
        <p>Este programa te permite desplazar los caracteres de un texto hacia un número X de posiciones en el alfabeto.</p>
        <br><br>
    </center>
        <div class="row">
            <div class="col-5"></div>
        <form action="Processor.jsp" method = "POST">
            Ingresa el número de posiciones a desplazar<br>
            <input type="number" name = "pos"><br><br>
            Ingresa el texto a desplazar<br>
            <input type="text" name = "text">
            <input type="submit" value="Submit">
        </form>
        </div>
    </div>
    </body>
</html>
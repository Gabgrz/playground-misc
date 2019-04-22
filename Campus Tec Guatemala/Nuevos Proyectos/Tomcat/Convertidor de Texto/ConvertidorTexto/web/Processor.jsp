<%-- 
    Document   : Processor
    Created on : 26/11/2017, 09:34:41 PM
    Author     : gab12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>Procesador Data</title>
      <link rel="stylesheet" type="text/css" href="mystyle.css">
   </head>
   
   <body>
      <h1>Gracias, hemos recibido tu solicitud</h1>
      <ul>
         <li><p><b>Posiciones a desplazar: </b>
            <% int pos = Integer.parseInt(request.getParameter("pos"));
                out.print(pos);%>
         </p></li>
          <li><p><b>Texto a desplazar</b>
            <% String myText = request.getParameter("text");
                out.print(myText);%>
         </p></li>
      </ul>
         
                <% 
                String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                int count = 0;
                int diff = 0;
                int longitud = 1;
                
                String[] textArray = myText.split("");
                String[] newArray = new String[textArray.length];
                
                for (int i = 0; i < textArray.length; i++){
                for (int x = 0; x < abc.length; x++){
                count++;
                if(textArray[i].equals(abc[x])){
                    longitud = x+pos+1;


                    if (longitud <= abc.length){
                        System.out.println(longitud);
                        System.out.println(abc.length);
                        newArray[i] = abc[x + pos];
                    }
                    else{
                        diff = longitud - abc.length;
                        newArray[i] = abc[diff-1];
                            }
                        }
                    }
                }
                String newString = String.join("",newArray);
                %>
                
                <br><br><br>
                <h2> Nuevo texto: </h2>
                <p id="newString"> <%out.print(newString);%> </p>
   </body>
</html>
<%@ page errorPage="error.jsp" %>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body bgcolor="yellow">
    <% 
      
      int k = 9/0;      

      out.println("Soma: " + k); 
    %>
  </body>
</html>

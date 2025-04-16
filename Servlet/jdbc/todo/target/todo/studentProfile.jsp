<%@ page language="java" import="java.sql.*" errorPage="error.jsp" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <%
      String url = "jdbc:mysql://localhost:3306/mysqlteste";
			String user = "douglas";
			String pass = "123";

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, user, pass);

      Statement st = con.createStatement();

      ResultSet rs = st.executeQuery("select * from estudantes where id = 1");
      rs.next();
    %>

    Id: <%= rs.getInt(1) %> </br>
    Nome: <%= rs.getString(2) %> </br>
    Nota: <%= rs.getDouble(3) %> </br>
  </body>
</html>

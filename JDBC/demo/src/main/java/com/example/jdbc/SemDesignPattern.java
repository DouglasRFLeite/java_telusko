package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SemDesignPattern {
    public static void run() throws Exception {
        String url = "jdbc:mysql://localhost:3306/mysqlteste";
        String uname = "douglas";
        String pass = "123";
        String dql = "SELECT * FROM estudantes";

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(dql);

        while (rs.next()) {
            System.out.println(rs.getInt("id") + ": " + rs.getString("nome") + " (" + rs.getDouble("nota") + ")");
        }

        /*
         * 1: João Silva (8.5)
         * 2: Maria Oliveira (9.2)
         * 3: Carlos Santos (7.3)
         */

        // Insert sem parametros
        String dml = "INSERT INTO estudantes VALUES (4, 'José Roberto', 9.8)";
        int count = st.executeUpdate(dml);
        System.out.println(count + " rows affected"); // 1 rows affected

        // Insert com parâmetros
        int id = 5;
        String nome = "Joana Elisa";
        double nota = 7.4;
        String dmlWithParams = "INSERT INTO estudantes VALUES (?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(dmlWithParams);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, nome);
        preparedStatement.setDouble(3, nota);
        count = preparedStatement.executeUpdate();
        System.out.println(count + " rows affected"); // 1 rows affected

        rs = st.executeQuery(dql);

        while (rs.next()) {
            System.out.println(rs.getInt("id") + ": " + rs.getString("nome") + " (" + rs.getDouble("nota") + ")");
        }

        /*
         * 1: João Silva (8.5)
         * 2: Maria Oliveira (9.2)
         * 3: Carlos Santos (7.3)
         * 4: José Roberto (9.8)
         * 5: Joana Elisa (7.4)
         */

        st.close();
        con.close();
    }

}
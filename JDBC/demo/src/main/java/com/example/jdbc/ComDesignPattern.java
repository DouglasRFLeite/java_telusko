package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ComDesignPattern {
	public static void run() throws Exception {

		System.out.println();
		System.out.println();

		StudenDAO dao = new StudenDAO();
		dao.connect();

		Student s = dao.getStudent(2);

		System.out.println(s.nome);

		Student buscado = dao.getStudent(7);

		System.out.println(buscado.nome);

	}

	public static class Student {
		int id;
		String nome;
		double nota;
	}

	public static class StudenDAO {

		Connection con;

		public void connect() throws Exception {
			String url = "jdbc:mysql://localhost:3306/mysqlteste";
			String uname = "douglas";
			String pass = "123";
			con = DriverManager.getConnection(url, uname, pass);
		}

		public Student getStudent(int id) {
			Student s = new Student();
			s.id = id;

			try {
				String query = "SELECT nome, nota FROM estudantes WHERE id=" + id;

				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);

				rs.next();
				s.nome = rs.getString(1);
				s.nota = rs.getDouble(2);

			} catch (Exception e) {
				System.out.println(e);
			}

			return s;
		}

		public void addStudent(Student student) {
			try {

				String query = "INSERT INTO estudantes VALUES (?,?,?)";

				PreparedStatement pst = con.prepareStatement(query);
				pst.setInt(1, student.id);
				pst.setString(2, student.nome);
				pst.setDouble(3, student.nota);

				pst.executeUpdate();
			} catch (Exception e) {
				System.out.println("1" + e);
			}
		}
	}

}
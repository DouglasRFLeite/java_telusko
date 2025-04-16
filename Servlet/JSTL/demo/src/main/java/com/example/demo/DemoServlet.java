package com.example.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) {
    String name = "Douglas";
    request.setAttribute("name", name);

    try {
      RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
      rd.forward(request, response);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

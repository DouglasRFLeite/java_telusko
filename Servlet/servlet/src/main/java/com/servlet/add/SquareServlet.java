package com.servlet.add;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {

        Cookie cookies[] = req.getCookies();
        int k = 0;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("sum")) {
                k = Integer.parseInt(cookie.getValue());
            }
        }

        int square = k * k;
        try {
            res.getWriter().println("Square: " + square);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

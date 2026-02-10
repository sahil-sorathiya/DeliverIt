package com.sahilpateldev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Hello");
        res.setContentType("text/html");
        res.getWriter().print("Hello from MyServlet");
    }
}

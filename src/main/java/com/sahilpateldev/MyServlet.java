package com.sahilpateldev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.*;
import java.util.Properties;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Hello");

        try {
            String url = "jdbc:postgresql://127.0.0.1:5432/todo";
            Properties properties = new Properties();
            properties.setProperty("user", "postgres");
            properties.setProperty("password", "4100");

            Connection connection = DriverManager.getConnection(url, properties);

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM todos");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                res.setContentType("text/html");
                res.getWriter().print(rs.getString(1) + " " + rs.getString(2));
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        res.setContentType("text/html");
        res.getWriter().print("Hello from MyServlet");
    }
}

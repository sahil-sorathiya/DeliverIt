package com.sahilpateldev;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class myServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        System.out.println("Hello");
    }
}

public class Main {
    static void main(String[] args) {
        System.out.println("Hello");

    }
}

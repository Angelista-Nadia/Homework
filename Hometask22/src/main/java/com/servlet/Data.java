package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Data extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service");
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String dataResponse = "Date: " + new java.util.Date();

        resp.getWriter().write(dataResponse);
    }
}

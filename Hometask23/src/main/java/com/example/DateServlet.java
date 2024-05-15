package com.example;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");

        if (username != null && username.length() >= 5) {
            request.getRequestDispatcher("/user").forward(request, response);
        } else {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            String dataResponse = "Date: " + new java.util.Date();

            response.getWriter().write(dataResponse);
        }
    }
}

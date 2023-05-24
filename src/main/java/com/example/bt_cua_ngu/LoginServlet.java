package com.example.bt_cua_ngu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();

        if ("admin".equals(username) && "admin".equals(password)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin.jsp");
            requestDispatcher.forward(request, response);
        } else if ("user".equals(username) && "user".equals(password)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user.jsp");
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }

    }
}
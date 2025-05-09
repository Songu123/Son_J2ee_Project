package com.son;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/input")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Forward the request to the JSP page
        req.getRequestDispatcher("/input-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set character encoding for request to handle UTF-8 input
        req.setCharacterEncoding("UTF-8");

        // Get parameters from the form
        String username = req.getParameter("username");
        String gender = req.getParameter("gender");

        // Store the parameters as request attributes to be used in JSP
        req.setAttribute("username", username);
        req.setAttribute("gender", gender);

        // Forward to the result JSP
        req.getRequestDispatcher("/input-result.jsp").forward(req, resp);
    }
}
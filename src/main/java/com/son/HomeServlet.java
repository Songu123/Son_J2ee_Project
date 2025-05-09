package com.son;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Xin chào từ HelloServlet qua web.xml!</h1>");
    }
}

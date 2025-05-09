package com.son;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/son")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException{
        System.out.println("Bắt đầu với init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        System.out.println("doGet được gọi!");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Xin chào từ Hello!</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy hoạt động!");
    }
}

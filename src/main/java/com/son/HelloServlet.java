
package com.son;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("==> init() được gọi");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("==> doGet() được gọi");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Xin chào từ HelloServlet!</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("==> destroy() được gọi");
    }

}


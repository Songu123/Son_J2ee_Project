package com.son;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;

@WebServlet(
        name = "LoginServlet",
        urlPatterns = {"/van", "/vanson"},
        loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "message", value = "Xin chào từ Annotation")
        }
)

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String msg = getServletConfig().getInitParameter("message");
        resp.getWriter().println(msg);
    }
}


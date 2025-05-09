package com.son;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;

@WebServlet(
        name = "LoginSuccessServlet",
        urlPatterns = {"/login"},
        loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "message", value = "Đăng nhập thành công!"),
                @WebInitParam(name = "greeting", value = "Chào mừng bạn đã quay trở lại!")
        }
)
public class LoginSuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Set content type and character encoding
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        // Get the initialization parameters
        String message = getServletConfig().getInitParameter("message");
        String greeting = getServletConfig().getInitParameter("greeting");
        System.out.println("doGet");
        // Write the response
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Login Success</title></head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>" + greeting + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doPost");
        doGet(req, resp);
    }
}

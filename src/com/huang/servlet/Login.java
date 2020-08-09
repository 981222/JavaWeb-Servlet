package com.huang.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private String username;
    private String password;

    @Override
    public void init(ServletConfig config) throws ServletException {
        username = config.getServletContext().getInitParameter("username");
        password = config.getServletContext().getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String un = req.getParameter("username");
        String pwd = req.getParameter("password");
        if (username.equals(un) && password.equals(pwd)){
//            req.setAttribute("username",username);
            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            resp.sendRedirect("welcome.jsp");
//            req.getRequestDispatcher("welcome.jsp").forward(req,resp);
        }else{
            resp.sendRedirect("login.jsp");
        }
    }
}

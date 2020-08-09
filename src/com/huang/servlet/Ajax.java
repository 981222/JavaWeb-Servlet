package com.huang.servlet;

import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Ajax")
public class Ajax extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            String id = req.getParameter("id");
//            System.out.println(id);
//            String str = "HelloWrold";
            User user = new User(1,"huang",21,100.0);
            //将Java对象传为Json格式
            JSONObject jsonObject = JSONObject.fromObject(user);
            resp.getWriter().write(jsonObject.toString());
//        req.getRequestDispatcher("Ajax.jsp").forward(req,resp);
    }
}

package com.huang.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private Map<Integer,User> map = new HashMap<>();

    public UserServlet() {
        map.put(1, new User(1,"张三",21,88.88));
        map.put(2, new User(2,"李四",19,98.5));
        map.put(3, new User(3,"王五",47,81.88));
        map.put(4, new User(4,"赵六",35,67.0));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if(method == null){
            method = "findAll";
        }
        switch (method){
            case "findAll":
                req.setAttribute("userList",map.values());
                req.getRequestDispatcher("user.jsp").forward(req, resp);
                break;
            case "delete":
                Integer idDelete = Integer.parseInt(req.getParameter("id"));
                map.remove(idDelete);
                resp.sendRedirect("/user?method=findAll");
                break;
            case "update":
                String nameUpdate = req.getParameter("name");
                Integer idUpdate = Integer.parseInt(req.getParameter("id"));
                Integer ageUpdate = Integer.parseInt(req.getParameter("age"));
                Double scoreUpdate = Double.parseDouble(req.getParameter("score"));
                req.setAttribute("id",idUpdate);
                req.setAttribute("name",nameUpdate);
                req.setAttribute("age",ageUpdate);
                req.setAttribute("score",scoreUpdate);
                req.getRequestDispatcher("addUser.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码
        req.setCharacterEncoding("UTF-8");

        String idStr = req.getParameter("id");
        String name = req.getParameter("name");
        String ageStr = req.getParameter("age");
        String scoreStr = req.getParameter("score");
        Integer id = Integer.parseInt(idStr);
        Integer age = Integer.parseInt(ageStr);
        Double score = Double.parseDouble(scoreStr);
        User user = new User(id,name,age,score);
        map.put(id,user);
        resp.sendRedirect("/user?method=findAll");
    }
}

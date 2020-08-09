package com.huang.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/song")
public class MyHttpServletTest extends MyHttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        System.out.println("GET");
        try {
            response.getWriter().write("GET");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("POST");
        response.getWriter().write("POST");
    }
}

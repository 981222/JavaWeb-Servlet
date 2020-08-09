package com.huang.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//使用注解的方式来映射
@WebServlet("/demo1")
public class MyServlet01 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *
     * @param servletRequest 请求的信息
     * @param servletResponse 响应的信息
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String id = servletRequest.getParameter("id");
        String name = servletRequest.getParameter("name");
        System.out.println(id + " : " + name);
        System.out.println("我是Servlet，我已经接收到了客户端发送来的请求。");
        //将信息返回到客户端。
        //直接返回中文信息会出现乱码。
        //使用 .setContentType("text/html;charset=UTF-8") 将文本以utf-8的编码输出。
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().write("Hello! Client");
        servletResponse.getWriter().write("你好~");
        servletResponse.getWriter().write("\n");
        servletResponse.getWriter().write("我已经接收到了你的请求 id:" + id);
        servletResponse.getWriter().write("我已经接收到了你的请求 name:" + name);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

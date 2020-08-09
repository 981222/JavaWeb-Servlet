package com.huang.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet("/demo2")
public class MyServlet02 implements Servlet {

    public MyServlet02() {
        System.out.println("创建了MyServlet02对象，并调用构造方法。");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(servletConfig.getServletName());
        System.out.println(servletConfig);
        ServletContext servletContext = servletConfig.getServletContext();

        System.out.println("对Servlet完成初始化操作...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行了Servlet的业务方法...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("释放了Servlet对象...");
    }

    @Override
    public String toString() {
        return "我的名字";
    }

}

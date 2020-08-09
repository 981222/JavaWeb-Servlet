package com.huang.servlet;

import java.lang.reflect.Constructor;

/**
 * 模拟Tomcat容器创建对象的全过程
 */
public class TomcatTest {
    public static void main(String[] args) {
        String className = "com.huang.servlet.MyServlet02";
        try {
            Class clazz = Class.forName(className);
            Constructor constructor = clazz.getConstructor();
            Object obj =  constructor.newInstance();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

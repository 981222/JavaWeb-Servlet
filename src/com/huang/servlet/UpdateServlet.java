package com.huang.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        //通过输入流获取客户端传来的数据
        InputStream inputStream = req.getInputStream();
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        //通过输出流将数据输出到本地硬盘。
        //获取文件夹的绝对路径。
        String path = req.getServletContext().getRealPath("file/copy.text");
        OutputStream outputStream = new FileOutputStream(path);
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String str = "";
        while ((str = bufferedReader.readLine()) != null){
            bufferedWriter.write(str);
        }
        bufferedWriter.close();
        writer.close();
        outputStream.close();
        bufferedReader.close();
        reader.close();
        inputStream.close();
        */

        try {
            DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            List<FileItem> list = servletFileUpload.parseRequest(req);
            for (FileItem item : list) {
                if(item.isFormField()){
                    String name = item.getFieldName();
                    String value = item.getString();
                    System.out.println(name + ":" + value);
                } else {
                    String fileName = item.getName();
                    long size = item.getSize();
                    System.out.println(fileName + ":" + size + "byte");
                    InputStream inputStream = item.getInputStream();
                    String path = req.getServletContext().getRealPath("file/" + fileName);
                    OutputStream outputStream = new FileOutputStream(path);
                    int countRead = 0;
                    while ((countRead = inputStream.read()) != -1){
                        outputStream.write(countRead);
                    }
                    outputStream.close();
                    inputStream.close();
                    System.out.println("上传成功!");
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

    }
}

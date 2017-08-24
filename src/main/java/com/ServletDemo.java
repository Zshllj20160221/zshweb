package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * localhost:8080/demo
 * http://localhost:8080/demo?name=test
 */
public class ServletDemo extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public ServletDemo(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        String name = req.getParameter("name");
        if ("test".equals(name)){
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }else{
            System.out.println(".........");
        }
    }
}

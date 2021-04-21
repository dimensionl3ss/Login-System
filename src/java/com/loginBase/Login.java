package com.loginBase;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
    String em = request.getParameter("email");
    String pass = request.getParameter("password");
    int flag=0;
    System.out.println(em+" "+pass);
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    Verify validate=new Verify();
    String person=validate.check(em, pass);
    if(person!=null){
         HttpSession session = request.getSession(true);
         session.setAttribute("name",person);
         response.sendRedirect("home.jsp");
    }
    else{
        out.print(
                "<script lang='javascript'>"
                        + "alert('Invalid username or password');"+
                "</script>"
        );
        out.print("<meta http-equiv='refresh' content='0;URL=login.html'>");
    }
   }
}
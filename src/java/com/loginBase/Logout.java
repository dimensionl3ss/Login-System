package com.loginBase;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class Logout extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      HttpSession session = request.getSession(false);
      // session.setAttribute("user", null);
      session.invalidate();  
      //session.removeAttribute("user");
     // session.getMaxInactiveInterval();
       //out.println("<center>Your session was destroyed successfully!!</center>");
       response.sendRedirect("home.html");
   }
}
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
    
    
       
//pw.println("<B>The selected uname is: ");
/*try{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/root","root","root");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from client");
String fn = null,ln = null;
while(rs.next())
{
    String n=rs.getString(3);
    String p=rs.getString(4);
    //System.out.println(n + p);
    if (n.equals(em) && p.equals(pass))
    {
            fn=rs.getString(1);
            ln=rs.getString(2);
            flag=1;
            break;
    }
}
if(flag==1)
{
        //out.print("Welcome, " + name);
         HttpSession session = request.getSession(true); // reuse existing
                                             // session if exist
                                             // or create one
                                             //System.out.print(session);
         session.setAttribute("FirstName", fn);
         session.setAttribute("LastName", ln);
         session.setMaxInactiveInterval(10); // 10 seconds
         response.sendRedirect("newjsp.jsp");
}
else {
     pw.print("<!Doctype html>\n" +
     "<html>\n" +
     "<head>\n" +
     " <title>Welcome</title>\n" +
     "</head>\n" +
     "<body>\n" +
     "<center>" +
     "Please register yourself"+"<br><br>"+
     "<form action='http://localhost:8080/ProjectForClass/Registration.html' method='post'>"+
     "<input type='submit' id='sumbit' value='click here to register'>"+
      "</form>"+
     "</center>"+
     "</body>\n" +
     "</html>");
        
    //response.sendRedirect("Registration.html");
}
}
catch(Exception e)
{
    System.out.println(e);
}
}
}*/
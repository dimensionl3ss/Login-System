package com.loginBase;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class Register extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String fn=request.getParameter("fname");
        String ln=request.getParameter("lname");
        String em=request.getParameter("email");
        String pass=request.getParameter("password");
        String gen=request.getParameter("gender");
        String count="India";
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver"); //register your driver class 
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/root","root","root");//set a connection with database
            PreparedStatement ps=con.prepareStatement("insert into client values(?,?,?,?,?,?)");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from client");
            boolean flag=false;
            while(rs.next())
            {
                String email=rs.getString(3);
                if(email.equals(em)){
                    flag=true;
                    break;
                }
            }
            if(flag==true)
            {
                out.print(
                        "<script lang='javascript'>"
                        +"alert('You are already registered please log in!!!');"
                        +"</script>"
                        );
                out.print("<meta http-equiv='refresh' content='0;URL=login.html'>");
            }
            else
            {
            ps.setString(1, fn);
            ps.setString(2, ln);
            ps.setString(3, em);
            ps.setString(4, pass);
            ps.setString(5, gen);
            ps.setString(6, count);
            int j=ps.executeUpdate();
            if(j>0)
                
                out.print("<script lang='javascript'>"
                        +"alert('Registration Successfull please log in!!!')"
                        +"</script>"
                        );
                out.print("<meta http-equiv='refresh' content='0;URL=login.html'>");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            out.close();
        }
   
    }
}

package com.loginBase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class Verify{
    public String check(String email, String pass)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/root","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM CLIENT");
            while(rs.next())
            {
                if(rs.getString(3).equals(email) && rs.getString(4).equals(pass))
                        return rs.getString(1)+" "+rs.getString(2);
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
}
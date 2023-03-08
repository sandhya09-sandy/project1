package com.project;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DisplayClasses extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection conn=null;
        PrintWriter out=resp.getWriter();
        String query="select * from createclass";
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tracking", "root", "Sandy@*09");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                //Display values
                out.println("NAME: " + rs.getString("uclassname"));
                out.println("SECTION: " + rs.getString("usection"));
                out.println("CLASSCODE: " + rs.getString("uclasscode"));
                out.println("SUBJECT: " + rs.getString("usubject"));
                out.println();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally{
            try {
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}





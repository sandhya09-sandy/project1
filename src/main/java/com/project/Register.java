package com.project;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        Connection conn=null;
        String name=req.getParameter("uname");
        String fname=req.getParameter("fname");
        String lname=req.getParameter("lname");
        String mobilenum=req.getParameter("mobilenum");
        String email=req.getParameter("email");
        String pw=req.getParameter("pw");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tracking","root","Sandy@*09");
            PreparedStatement pstmt=conn.prepareStatement("insert into registered(uname,fname,lname,mobilenum,email,pw) values(?,?,?,?,?,?)");
            pstmt.setString(1,name);
            pstmt.setString(2,fname);
            pstmt.setString(3,lname);
            pstmt.setString(4,mobilenum);
            pstmt.setString(5,email);
            pstmt.setString(6,pw);
            out.println(name);
            out.println(fname);
            out.println(lname);
            out.println(mobilenum);
            out.println(email);
            out.println(pw);
            int count=pstmt.executeUpdate();
            pstmt.executeUpdate();
            out.println(count);
            resp.sendRedirect("web.jsp");
        }
        catch(Exception e)
        {
            out.println(e);
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


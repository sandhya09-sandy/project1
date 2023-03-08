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


public class Create extends  HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        Connection conn = null;
        String name = req.getParameter("uclassname");
        String section = req.getParameter("usection");
        String classcode = req.getParameter("uclasscode");
        String subject = req.getParameter("usubject");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tracking", "root", "Sandy@*09");
            PreparedStatement pstmt = conn.prepareStatement("insert into createclass(uclassname,usection,uclasscode,usubject) values(?,?,?,?)");
            pstmt.setString(1, name);
            pstmt.setString(2, section);
            pstmt.setString(3, classcode);
            pstmt.setString(4, subject);
            out.println(name);
            out.println(section);
            out.println(classcode);
            out.println(subject);
            int count = pstmt.executeUpdate();
            pstmt.executeUpdate();
            out.println(count);
            resp.sendRedirect("Displayclasses.jsp");

        } catch (Exception e) {
            out.println(e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

package com.project;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Enroll extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        Connection conn = null;
        String id = req.getParameter("stid");
        String name = req.getParameter("stuname");
        String classcode = req.getParameter("classcode");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tracking", "root", "Sandy@*09");
            PreparedStatement pstmt = conn.prepareStatement("insert into enrolled(stid,stuname,classcode) values(?,?,?)");
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, classcode);

            out.println(id);
            out.println(name);
            out.println(classcode);
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






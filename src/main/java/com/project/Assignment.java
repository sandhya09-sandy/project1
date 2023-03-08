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

public class Assignment extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Connection conn = null;
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String points = req.getParameter("points");
        String duedate = req.getParameter("duedate");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tracking", "root", "Sandy@*09");
            PreparedStatement pstmt = conn.prepareStatement("insert into assignment(title,description,points,duedate) values(?,?,?,?)");
            pstmt.setString(1, title);
            pstmt.setString(2, description);
            pstmt.setString(3, points);
            pstmt.setString(4, duedate);
            out.println(title);
            out.println(description);
            out.println(points);
            out.println(duedate);
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

package com.example.demo.servlet;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.StudentEntity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

@WebServlet(value = "/add-student")
public class StudentServlet extends HttpServlet {
    private StudentDAO studentDAO;

    public void init(){
        studentDAO = new StudentDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.printf("<h1>Add Student</h1>");
        out.printf("<form action='add-student' method='POST'");
        out.printf("<table>");
        out.print("<tr><td>Student Code:</td><td><input type='text' name='studentCode'/></td></tr><br/>");
        out.print("<tr><td>Name:</td><td><input type='text' name='name'/></td></tr><br/>");
        out.print("<tr><td>Birthyear:</td><td><input type='date' name='birthyear'/></td></tr><br/>");
        out.print("<tr><td>Phone:</td><td><input type='text' name='phone'/></td></tr><br/>");
        out.print("<tr><td colspan='2'><input type='submit' value='Submit '/></td></tr>");
        out.print("</table>");
        out.print("</form>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            String studentCode = req.getParameter("studentCode");
            String name = req.getParameter("name");
            String birthyear = req.getParameter("birthyear");
            String phone = req.getParameter("phone");
            StudentEntity student = new StudentEntity(studentCode,name,birthyear,phone);
            studentDAO.createStudent(student);
        }catch (Exception ex){
            System.out.printf(ex.getMessage());
        }
    }
}
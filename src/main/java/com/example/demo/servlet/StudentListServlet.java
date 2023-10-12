package com.example.demo.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.example.demo.dao.StudentDAO;
import com.example.demo.dao.impl.StudentDAOImpl;
import com.example.demo.entity.StudentEntity;
import jakarta.servlet.*;

@WebServlet(value = "/list-student")

public class StudentListServlet extends HttpServlet {
    private StudentDAO studentDAO;

    public void init(){
        studentDAO = new StudentDAOImpl();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        List<StudentEntity> studentList = studentDAO.getAll();
        req.setAttribute("studentList",studentList);
        PrintWriter out=resp.getWriter();
        out.println("<a href='index.html'>Add New Employee</a>");
        out.println("<h1>Employees List</h1>");
        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>StudentCode</th><th>Name</th><th>Birthday</th><th>Phone</th><th>Edit</th><th>Delete</th></tr>");

        for(StudentEntity s:studentList){
            out.print("<tr><td>"+s.getId()+"</td><td>"+s.getStudentCode()+"</td><td>"+s.getName()+"</td><td>"+s.getBirthday()+"</td><td>"+s.getPhone()+"</td><td><a href='EditServlet?id="+s.getId()+"'>edit</a></td><td><a href='DeleteServlet?id="+s.getId()+"'>delete</a></td></tr>");


        }
        out.print("</table>");

        out.close();
    }
}

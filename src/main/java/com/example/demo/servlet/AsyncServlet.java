package com.example.demo.servlet;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/sync-servlet", asyncSupported = true)
public class AsyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Sync Servlet</h1>");
        out.println("<progress id = 'progress' max='100'></progress>");
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    out.println("<script>document.getElementById('progress').value = '" + i++ + "';</script>");
                    out.flush();
                    try {
                    Thread.sleep(100);
                    } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
            asyncContext.complete();
        }
    });
        out.println("<h1>progress success</h1>");
        out.println("</body></html>");

    }
}

package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/form")
public class form extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h2>Forms</h2>\n" + //
                        "\n" + //
                        "<form action=\"/JDBC-form/form\" method=\"post\">\n" + // 
                        "  <label for=\"fname\">First name:</label><br>\n" + //
                        "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"John\"><br>\n" + //
                        "  <label for=\"lname\">Last name:</label><br>\n" + //
                        "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"Doe\"><br><br>\n" + //
                        "  <input type=\"submit\" value=\"Submit\">\n" + //
                        "</form> \n" + //
                        "\n" + //
                        "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/form\".</p>\n" + //
                        "\n" + //
                        "</body>\n" + //
                        "</html>\n" + //
                        "\n" + //
                        "");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // request.getRequestDispatcher("/form").forward(request, response);
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        response.getWriter().println("<h1 style='color: red;'>Hello, " + fname + " " + lname + "!</h1>");
    }
}

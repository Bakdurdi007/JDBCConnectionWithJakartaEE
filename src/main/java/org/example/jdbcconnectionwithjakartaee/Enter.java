package org.example.jdbcconnectionwithjakartaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/enter")
public class Enter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String id = req.getParameter("id");
        String password = req.getParameter("password");

        int UserID = Integer.parseInt(id);

        UserService userService = new UserService();

        if ((!userService.get(UserID).equals("null")) && (userService.get(UserID).getPassword().equals(password))) {
            out.println("<h1> Assalom alaykum </h1>" + userService.get(UserID).getLast_name() + " " + userService.get(UserID).getFirst_name());
        } else{
            out.println("<h1> Bunday ma'lumot bazadan topilmadi! </h1>");
        }

    }
}

package org.example.jdbcconnectionwithjakartaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addUser")
public class DataBaseConnection extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String id = req.getParameter("id");
        String last_name = req.getParameter("last_name");
        String first_name = req.getParameter("first_name");
        String password = req.getParameter("password");

        int UserID = Integer.parseInt(id);

        UserService userService = new UserService();

        User user = new User(UserID, last_name, first_name, password);

        userService.add(user);

        out.println(" Sizning ma'lumotlaringiz bazaga yozib olindi! ");
    }
}

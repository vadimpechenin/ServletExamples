package com.getpost;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "ColorGetServlet", urlPatterns = "/colorget")
public class MainServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>Get: The selected color is: ");  //Выбранный цвет
        pw.println(color);
        pw.close();
        //RequestDispatcher dispatcher = request.getRequestDispatcher("/testtt.html");
        //dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>Post: The selected color is: ");  //Выбранный цвет
        pw.println(color);
        pw.close();
    }
}

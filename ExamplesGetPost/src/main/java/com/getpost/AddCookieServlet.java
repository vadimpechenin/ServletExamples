package com.getpost;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Получить параметр из HTTP-запроса
        String data = request.getParameter("data");
        //Создать cookie-набор
        Cookie cookie = new Cookie("MyCookie", data);
        //Добавить cookie-набор в HTTP-ответ
        response.addCookie(cookie);
        //Записать выход в браузер.
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>My Cookie has been set to</B>");
        pw.println(data);
        pw.println("<ul class=\"submenu\">");
        pw.println("<li><a href=\"AddCookie.html\">to Add Cookie form</a></li>");
        pw.println("<li><a href=\"http://localhost:8080/getcookies\">to get Cookies servlet</a></li>");
        pw.println("</ul>");
        pw.close();
    }
}

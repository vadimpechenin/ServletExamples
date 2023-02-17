package com.getpost;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Получить cookie-наборы из заголовка HTTP-запроса.
        Cookie[] cookies = request.getCookies();
        //Отобразить полученные cookie-наборы
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>");
        for (int i = 0; i < cookies.length; i++) {
            String name = cookies[i].getName();
            String value = cookies[i].getValue();
            int age = cookies[i].getMaxAge();
            pw.println("name = " + name + "; value = " + value + "; age = " + age);
        }
        pw.println("<ul class=\"submenu\">");
        pw.println("<li><a href=\"AddCookie.html\">to add cookie</a></li>");
        pw.println("</ul>");
        pw.close();
    }
}

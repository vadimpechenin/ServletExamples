package com.getpost;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Получить объект HttpSession.
        HttpSession hs = request.getSession(true);
        // Получить средство записи.
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.print("<B>");
        //Отобразить дату и время последнего доступа.
        Date date = (Date)hs.getAttribute("date");
        if (date != null) {
            pw.print("Last access: " + date + "<br>"); //Последний доступ
        }
        //Отобразить текущие дату и время.
        date = new Date();
        hs.setAttribute("date", date);
        pw.println("Current date: " + date); // Текущая дата
        pw.println("<ul class=\"submenu\">");
        pw.println("<li><a href=\"Date.html\">to date form</a></li>");
        pw.println("</ul>");
    }
}

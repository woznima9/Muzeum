package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowMuzeumsServlet", value = "/showMuzeum")
public class ShowMuzeumsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("poszło get z /showmuzeum");
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("fromServletHeader","Nagłówek strony przekazany servletem");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}

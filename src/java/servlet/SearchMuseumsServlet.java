package servlet;

import szukacz.Muzeum;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name = "SearchMuseumsServlet", value = "/searchMuzeums")
public class SearchMuseumsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String szukamMiasta = request.getParameter("miastaSzukaj");
        String szukamUlicy = request.getParameter("ulicySzukaj");
        System.out.println(szukamMiasta);
        request.setAttribute("miastaSzukaj", szukamMiasta);
        request.setAttribute("szukajUlicy", szukamUlicy);
        request.setAttribute("fromServletHeader", szukamMiasta);
        Connection connection = null;
        PreparedStatement select = null;
        ResultSet results = null;
        ArrayList<Muzeum> muzeumsArrayList = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:/sqlite/Muzea.db");
            select = connection.prepareStatement("select * from museums where miasto like ? or ulica like ?");
            select.setString(1, szukamMiasta);
            select.setString(2, szukamUlicy);
            results = select.executeQuery();
            while (results.next()) {
                Muzeum muzeum = new Muzeum(
                        results.getInt("id"),
                        results.getString("nazwa"),
                        results.getString("kod"),
                        results.getString("miasto"),
                        results.getString("pref_ulicy"),
                        results.getString("ulica"),
                        results.getString("nr_domu"),
                        results.getString("nr_lokalu"),
                        results.getString("zalozyciel"),
                        results.getString("data_wpisu"),
                        results.getString("status")
                );
                muzeumsArrayList.add(muzeum);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                results.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("muzeums", muzeumsArrayList);
            request.getRequestDispatcher("/WEB-INF/showMuzeums.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("poszło get z /searchMuzeums");
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("fromServletHeader", "SEARCH Museums");
        request.getRequestDispatcher("/WEB-INF/searchMuzeums.jsp").forward(request, response);
    }
}

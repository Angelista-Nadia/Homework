package com.example;

import com.example.Movie.Film;
import com.example.Movie.Genre;
import com.example.Service.FilmService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class HomeServlet extends HttpServlet {

    private FilmService service = new FilmService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var films = service.getAll();
        req.setAttribute("films", films);

        req.getRequestDispatcher("/WEB-INF/Films.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        int year = Integer.parseInt(req.getParameter("year"));
        String description = req.getParameter("description");
        var genre = Genre.valueOf(req.getParameter("genre"));
        String view = req.getParameter("view");

        boolean isView = view == null || view.isBlank() ? false : true;

        Film film = new Film(title, year, description, genre, isView);
        service.add(film);

        resp.sendRedirect("/");
    }
}

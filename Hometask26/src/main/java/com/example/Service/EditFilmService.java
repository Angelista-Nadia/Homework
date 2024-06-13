package com.example.Service;

import com.example.Movie.Film;
import com.example.Movie.Genre;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;

@WebServlet("/edit")
public class EditFilmService extends HttpServlet {

    private FilmService service = new FilmService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        UUID uuid = UUID.fromString(id);

        Film film = service.getById(uuid);

        req.setAttribute("film", film);

        req.getRequestDispatcher("/WEB-INF/edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        int year = Integer.parseInt(req.getParameter("year"));
        String description = req.getParameter("description");
        var genre = Genre.valueOf(req.getParameter("genre"));
        UUID uuid = UUID.fromString(req.getParameter("id"));
        String view = req.getParameter("view");

        boolean isView = view == null || view.isBlank() ? false : true;

        Film film = new Film(title, year, description, genre, isView);

        service.update(uuid, film);

        resp.sendRedirect("/");
    }
}

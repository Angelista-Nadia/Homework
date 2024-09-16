package com.example.mapper;

import com.example.Movie.Film;
import com.example.Movie.Genre;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FilmMapper {
    public Film map(ResultSet resultSet, boolean needNext) {
        Film film = new Film();
        try {

            if (needNext) {
                resultSet.next();
            }

            UUID id = resultSet.getObject("id", UUID.class);
            String title = resultSet.getString("title");
            int year = resultSet.getInt("year");
            String description = resultSet.getString("description");
            Genre genre = Genre.valueOf(resultSet.getString("genre"));
            Boolean isView = resultSet.getBoolean("is_view");

            film.setId(id);
            film.setTitle(title);
            film.setYear(year);
            film.setDescription(description);
            film.setGenre(genre);
            film.setIsView(isView);
        } catch (SQLException e) {
            return null;
        }

        return film;

    }

    @SneakyThrows
    public List<Film> maps(ResultSet resultSet) {
        List<Film> films = new ArrayList<>();
        while (resultSet.next()) {
            Film film = map(resultSet, false);
            if (film != null) {
                films.add(film);
            }
        }
        return films;
    }
}

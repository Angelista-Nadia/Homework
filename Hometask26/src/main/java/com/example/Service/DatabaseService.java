package com.example.Service;

import com.example.Movie.Film;
import com.example.Movie.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DatabaseService {

    private static List<Film> films = new ArrayList<>();

    static {
        films.add(new Film("film1", 1980,"description1", Genre.DRAMA, false));
        films.add(new Film("film2", 2000,"description2", Genre.HORROR, true));
        films.add(new Film("film3", 1990,"description3", Genre.COMEDY,true));
    }

    public void add(Film film) {
        films.add(film);
    }

    public List<Film> getAll() {
        return films;
    }

    public Film getById(UUID id) {
        var find = films.stream()
                .filter(film -> film.getId().equals(id))
                .findFirst();

        return find.orElseThrow(() -> new RuntimeException("Film not found"));
    }

    public void update(UUID uuid, Film film) {
        for (var item : films) {
            if (item.getId().equals(uuid)) {
                item.setTitle(film.getTitle());
                item.setYear(film.getYear());
                item.setDescription(film.getDescription());
                item.setGenre(film.getGenre());
                item.setIsView(film.getIsView());
            }
        }
    }

    public void delete(UUID uuid) {

        Film byId = getById(uuid);
        films.remove(byId);
    }
}

package com.example.Service;

import com.example.Movie.Film;

import java.util.List;
import java.util.UUID;

public class FilmService {

    DatabaseService service = new DatabaseService();

    public void add(Film film) {
        service.add(film);
    }

    public List<Film> getAll() {
        return  service.getAll();
    }

    public Film getById(UUID uuid) {
        return service.getById(uuid);
    }

    public void update(UUID uuid, Film film) {
        service.update(uuid, film);
    }

    public void delete(UUID uuid) {
        service.delete(uuid);
    }
}
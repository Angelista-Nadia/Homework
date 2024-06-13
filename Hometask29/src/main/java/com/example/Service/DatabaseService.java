package com.example.Service;

import com.example.Movie.Film;
import com.example.mapper.FilmMapper;

import java.sql.*;
import java.util.List;
import java.util.UUID;

public class DatabaseService {

    private static FilmMapper mapper = new FilmMapper();

    public void add(Film film) {

        try (Connection connection = getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement("insert into films (id, title, year, description, genre, is_view) VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setObject(1, film.getId());
            preparedStatement.setString(2, film.getTitle());
            preparedStatement.setInt(3, film.getYear());
            preparedStatement.setString(4, film.getDescription());
            preparedStatement.setString(5, film.getGenre().name());
            preparedStatement.setBoolean(6, film.getIsView());

            preparedStatement.execute();

        } catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
    }

    public List<Film> getAll() {
        try (Connection connection = getConnection()){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from films");
            return mapper.maps(resultSet);

        } catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
    }

    public Film getById(UUID id) {
       try (Connection connection = getConnection()){
           PreparedStatement preparedStatement = connection.prepareStatement("select * from films where id = ?");
           preparedStatement.setObject(1, id);

           ResultSet resultSet = preparedStatement.executeQuery();

           Film map = mapper.map(resultSet, true);

           return map;

       } catch (Exception exc) {
           throw new RuntimeException(exc);
       }
    }

    public void update(UUID uuid, Film film) {
       try (Connection connection = getConnection()){

           PreparedStatement preparedStatement = connection.prepareStatement("UPDATE films SET title = ?, year = ?, description = ?, genre = ?, is_view = ? WHERE id = ?");
           preparedStatement.setString(1, film.getTitle());
           preparedStatement.setInt(2, film.getYear());
           preparedStatement.setString(3, film.getDescription());
           preparedStatement.setString(4, film.getGenre().name());
           preparedStatement.setBoolean(5, film.getIsView());
           preparedStatement.setObject(6, uuid);

           preparedStatement.execute();

       } catch (Exception exc) {
           throw new RuntimeException(exc);
       }
    }

    public void delete(UUID uuid) {

        try (Connection connection = getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM films WHERE id = ?");
            preparedStatement.setObject(1, uuid);
            preparedStatement.execute();

        } catch (Exception exc) {

        }
    }

    public List<Film> find(String seatch) {
        try (Connection connection = getConnection()) {

//            PreparedStatement preparedStatement = connection.prepareStatement("select * from films where title like ?");
//            preparedStatement.setString(1, seatch);
//            ResultSet resultSet = preparedStatement.executeQuery();
            Statement preparedStatement = connection.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery("select * from films where title like '%" + seatch + "%'");


            return mapper.maps(resultSet);

        } catch (Exception exc) {
            throw new RuntimeException(exc);
        }

    }

    private Connection getConnection() {
        try {
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/library_films?user=postgres&password=postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
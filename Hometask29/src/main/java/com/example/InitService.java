package com.example;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(urlPatterns = "/init", loadOnStartup = 1)
public class InitService extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = getConnection();

            Statement statement = connection.createStatement();

            statement.execute("create table if not exists films (\n" +
                    "    id uuid primary key,\n" +
                    "    title varchar,\n" +
                    "    year varchar,\n" +
                    "    description varchar,\n" +
                    "    genre varchar,\n" +
                    "    is_view boolean\n" +
                    ");");

            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
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

package com.example.Movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    private UUID id;
    private String title;
    private Integer year;
    private String description;
    private Genre genre;
    private Boolean isView;

    public Film(String title, Integer year, String description, Genre genre, Boolean isView) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.year = year;
        this.description = description;
        this.genre = genre;
        this.isView = isView;
    }
}

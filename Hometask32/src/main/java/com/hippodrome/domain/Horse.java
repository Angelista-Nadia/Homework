package com.hippodrome.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Horse {
    private String name;

    public String getName() {
        return name;
    }
}
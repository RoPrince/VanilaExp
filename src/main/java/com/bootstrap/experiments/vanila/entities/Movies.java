package com.bootstrap.experiments.vanila.entities;

import lombok.Data;

import java.time.Year;

@Data
public class Movies {

    private Integer movieId;
    private String movieName;
    private String originLang;
    private Year releaseYear;
    private Float rating;
}

package com.bootstrap.experiments.vanila.business;

import com.bootstrap.experiments.vanila.provider.MovieGetProvider;
import org.springframework.stereotype.Component;

@Component
public class MovieSearchService {

    private MovieGetProvider movieGetProvider;

    public MovieSearchService(MovieGetProvider movieGetProvider) {
        this.movieGetProvider = movieGetProvider;
    }

    public String getAllMovies() {
        return movieGetProvider.getAllMovies();
    }
}

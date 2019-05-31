package com.boostrap.experiments.vanila.business;

import com.boostrap.experiments.vanila.provider.MovieGetProvider;
import org.springframework.stereotype.Component;

@Component
public class MovieSearchService {

    private MovieGetProvider movieGetProvider;

    public MovieSearchService(MovieGetProvider movieGetProvider){
        this.movieGetProvider =movieGetProvider;
    }
}

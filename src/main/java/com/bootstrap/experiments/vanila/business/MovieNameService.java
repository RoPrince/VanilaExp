package com.bootstrap.experiments.vanila.business;

import com.bootstrap.experiments.vanila.provider.MovieNameRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieNameService {

    @Autowired
    MovieNameRetriever movieNameRetriever;

    public String getMovieName() {
        return movieNameRetriever.getMovieName();

    }
}

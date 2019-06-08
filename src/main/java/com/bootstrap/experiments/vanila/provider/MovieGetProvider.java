package com.bootstrap.experiments.vanila.provider;

import org.springframework.stereotype.Repository;

@Repository
public class MovieGetProvider {

    public String getAllMovies(){
        return "All Movies";
    }
}

package com.bootstrap.experiments.vanila.provider;

import com.bootstrap.experiments.vanila.entities.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetMovieDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Movies> findAllMovies(){
        jdbcTemplate.query("select * from Movies",JdbcBMovies.class);
    }
}

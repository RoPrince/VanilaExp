package com.bootstrap.experiments;


import com.bootstrap.experiments.vanila.business.MovieNameService;
import com.bootstrap.experiments.vanila.business.MovieSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.bootstrap.experiments")
public class VanilaApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(VanilaApplication.class);

    @Autowired
    MovieNameService movieNameService;

    @Autowired
    MovieSearchService movieSearchService;

    public static void main(String[] args) {

        SpringApplication.run(VanilaApplication.class, args);

//       ConfigurableApplicationContext AppContext = SpringApplication.run(VanilaApplication.class, args);

//        MovieSearchService movieSearchService = AppContext.getBean(MovieSearchService.class);
//        logger.info("{}",movieSearchService);
//        MovieNameService movieNameService = AppContext.getBean(MovieNameService.class);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(movieNameService.getMovieName());
        logger.info(movieSearchService.getAllMovies());
    }
}

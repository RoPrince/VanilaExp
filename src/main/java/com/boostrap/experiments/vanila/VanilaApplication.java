package com.boostrap.experiments.vanila;

import com.boostrap.experiments.vanila.business.MovieSearchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VanilaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext AppContext = SpringApplication.run(VanilaApplication.class, args);
		System.out.println(AppContext.getBean(MovieSearchService.class));
	}

}

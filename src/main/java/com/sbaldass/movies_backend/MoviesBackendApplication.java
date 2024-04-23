package com.sbaldass.movies_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class MoviesBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesBackendApplication.class, args);
    }

}

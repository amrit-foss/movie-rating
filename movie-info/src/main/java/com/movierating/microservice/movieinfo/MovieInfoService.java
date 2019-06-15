package com.movierating.microservice.movieinfo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoService {

    @RequestMapping("/{movieId}")
    public MovieInfoItem getMovieInfo(@PathVariable("movieId") String movieId){
        return new MovieInfoItem(movieId,"SHEILA");

    }
}

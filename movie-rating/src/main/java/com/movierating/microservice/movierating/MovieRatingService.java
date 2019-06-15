package com.movierating.microservice.movierating;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class MovieRatingService {

    @RequestMapping("/{movieId}")
    public List<MovieRatingitem> getRating(@PathVariable("movieId") String movieId){
        return Collections.singletonList(new MovieRatingitem(movieId, 10));

    }
}

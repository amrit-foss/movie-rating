package com.movierating.microservice.moviecatalog.Resources;


import com.movierating.microservice.moviecatalog.Models.CatalogItem;
import com.movierating.microservice.moviecatalog.Models.MovieInfoItem;
import com.movierating.microservice.moviecatalog.Models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){


        RestTemplate restTemplate = new RestTemplate();

        List<Rating> ratings = Arrays.asList(
            new Rating("12334", 2)

        );

        return ratings.stream().map(rating -> {
            MovieInfoItem movie = restTemplate.getForObject("http://localhost:8082/movies/12334", MovieInfoItem.class);
            return new CatalogItem(movie.getName(),rating.getRating(), "chutiya");
        })
        .collect(Collectors.toList());


    }
}

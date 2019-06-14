package com.movierating.microservice.moviecatalog;

public class CatalogItem {

    private String name;
    private int rating;
    private String details;

    public CatalogItem(String name, int rating, String details) {
        this.name = name;
        this.rating = rating;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

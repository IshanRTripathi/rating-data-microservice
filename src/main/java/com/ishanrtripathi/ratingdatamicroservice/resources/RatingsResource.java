package com.ishanrtripathi.ratingdatamicroservice.resources;

import com.ishanrtripathi.ratingdatamicroservice.models.Rating;
import com.ishanrtripathi.ratingdatamicroservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings= Arrays.asList(
                new Rating("12ish34", 8),
                new Rating("5678", 5)
        );
        UserRating userRating= new UserRating();
        userRating.setUserRatings(ratings);
        return userRating;
    }
}

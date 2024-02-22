package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable String id) {
        // For demonstration, returning a hardcoded movie object.
        // In a real application, you'd fetch this data from a database.
        return new Movie(id, "The Bahubali Conclusion", "SS Rajamouli");
    }
}

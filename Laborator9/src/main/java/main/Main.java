package main;

import entities.Movie;
import factory.EntityManagerFactory;
import repositories.MovieRepository;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setRelease_date("22-05-1998");
        movie.setScore(21);
        movie.setDuration(58);
        movie.setId(1);

        MovieRepository movieRepository = new MovieRepository();
        movieRepository.create(movie);

        List<Movie> movies = movieRepository.findByName("Terminator");
        System.out.println(movies);

    }
}

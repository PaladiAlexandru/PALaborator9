package repositories;

import entities.Movie;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MovieRepositoryTest {

    @Test
    public void ShouldReturnAMovieById() {
        MovieRepository movieRepository = new MovieRepository();
        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setRelease_date("22-05-1998");
        movie.setScore(21);
        movie.setDuration(58);
        movie.setId(1);
        Movie movie1 = movieRepository.findById(1);
        Assert.assertEquals(movie,movie1);
    }

    @Test
    public void shouldReturnAListOfMoviesByName() {
        MovieRepository movieRepository = new MovieRepository();
        Movie movie = new Movie();
        movie.setTitle("Terminator");
        movie.setRelease_date("22-05-1998");
        movie.setScore(21);
        movie.setDuration(58);
        movie.setId(1);
        List<Movie> expected = new ArrayList<>();
        expected.add(movie);
        List<Movie> movie1 = movieRepository.findByName("Terminator");
        Assert.assertEquals(expected,movie1);
    }
}
package fr.eni.movielibrary.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("movieBean")
public class MovieController {
    final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<Movie> showAllMovies() {
        System.out.println(this.movieService);
        return this.movieService.getAllMovies();
    }

    public Movie findMovie(int id) {
        System.out.println(this.movieService);
        return this.movieService.getMovieById(id);
    }

}

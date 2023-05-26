package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes({"loggedUser"})
public class MovieController {
    final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public String home() {
        return "redirect:/movies";
    }

    @GetMapping("/movies")
    public String showAllMovies(Model model) {
        List<Movie> movies = this.movieService.getAllMovies();
        model.addAttribute(movies);

        return "movies/index";
    }

    @GetMapping("/movies/{movie_id}")
    public String findMovie(@PathVariable("movie_id") int id, Model model) {
        Movie movie = this.movieService.getMovieById(id);
        model.addAttribute(movie);

        return "movies/show";
    }
}

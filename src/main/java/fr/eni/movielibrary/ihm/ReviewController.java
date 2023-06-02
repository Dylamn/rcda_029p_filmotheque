package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Review;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
    private final MovieService movieService;

    public ReviewController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/reviews")
    public String store(@RequestParam("_movieId") int movieId, @ModelAttribute("newReview") Review review) {
        Movie movie = movieService.getMovieById(movieId);

        movie.addReview(review);
        movieService.saveMovie(movie);

        return String.format("redirect:/movies/%d", movie.getId());
    }
}

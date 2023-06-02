package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Member;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Review;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        model.addAttribute("emptyReview", new Review());

        return "movies/show";
    }

    @GetMapping("/movies/add")
    public String addMovie(Model model) {
        Member member = (Member) model.getAttribute("loggedUser");
        if (member == null) {
            return "redirect:/login";
        }

        model.addAttribute("movie", new Movie());
        model.addAttribute("genres", movieService.getGenres());
        model.addAttribute("participants", movieService.getParticipants());

        return "movies/store";
    }

    @PostMapping("/movies")
    public String store(@Valid @ModelAttribute("newMovie") Movie movie, BindingResult bindingResult, Model model) {
//        List<String> errors = new ArrayList<>();

        if (model.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }

//        if (movie.getDuration() < 1) {
//            errors.add("La durée d'un film doit être supérieur à 0.");
//        }
//        if (movie.getSynopsis().length() < 20 || movie.getSynopsis().length() > 250) {
//            errors.add("La longueur du synopsis doit être compris entre 20 et 250 caractères.");
//        }

        if (bindingResult.hasErrors()) {
//        model.addAttribute("errors", errors);
            model.addAttribute("movie", new Movie());
            model.addAttribute("genres", movieService.getGenres());
            model.addAttribute("participants", movieService.getParticipants());

            return "movies/store";
        }
        movieService.saveMovie(movie);

        return "redirect:/movies";
    }
}

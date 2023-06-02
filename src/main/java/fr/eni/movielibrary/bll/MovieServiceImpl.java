package fr.eni.movielibrary.bll;

import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.dal.jpa.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie getMovieById(long id) {
        return movieRepository.findById(id).orElse(null);
    }
}

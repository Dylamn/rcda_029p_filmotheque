package fr.eni.movielibrary.dal;

import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.dal.jpa.MovieRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


public class MovieDAOJPA {
    private final MovieRepository movieRepository;

    public MovieDAOJPA(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;

    }

    @Query("SELECT p FROM Personne p JOIN p.civilite c ORDER BY libelle, c")
    public List<Movie> getAll() {
        return (List<Movie>) movieRepository.findAll();
    }
}

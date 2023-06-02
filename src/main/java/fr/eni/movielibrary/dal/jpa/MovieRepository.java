package fr.eni.movielibrary.dal.jpa;

import fr.eni.movielibrary.bo.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}

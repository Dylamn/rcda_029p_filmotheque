package fr.eni.movielibrary.bo.converters;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Genre;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToGenreConverter implements Converter<String, Genre> {
    private final MovieService movieService;

    public StringToGenreConverter(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public Genre convert(String id) {
        return movieService.getGenreById(Integer.parseInt(id));
    }
}

package fr.eni.movielibrary.bo.converters;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Participant;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToParticipantConverter implements Converter<String, Participant> {
    private final MovieService movieService;

    public StringToParticipantConverter(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public Participant convert(String id) {
        return movieService.getParticipantById(Integer.parseInt(id));
    }
}

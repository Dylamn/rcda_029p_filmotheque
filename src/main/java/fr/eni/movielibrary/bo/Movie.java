package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {
    private long id;
    private String title;
    private int year;
    private int duration;
    private String synopsis;
     
    // Relationships
    private Participant producer;
    private List<Participant> actors;
    private Genre genre;
    private List<Review> reviews;

    //#region Getters/Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Participant getProducer() {
        return producer;
    }

    public void setProducer(Participant producer) {
        this.producer = producer;
    }

    public List<Participant> getActors() {
        return actors;
    }

    public void setActors(List<Participant> actors) {
        this.actors = actors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    //#endregion

    public Movie() {

    }

    public Movie(long id, String title, int year, int duration, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
    }

    public Movie(
            long id, String title, int year, int duration, String synopsis,
            Participant producer, List<Participant> actors, Genre genre, List<Review> reviews
    ) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
        this.producer = producer;
        this.actors = actors;
        this.genre = genre;
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return String.format("Titre : %s | Année : %s | Durée : %dmins", this.title, this.year, this.duration);
    }
}

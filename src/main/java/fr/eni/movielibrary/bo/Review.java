package fr.eni.movielibrary.bo;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    int rating;

    String comment;

    // Relationships
    @ManyToOne
    Movie movie;

    @ManyToOne
    Member member;

    //#region Getters/Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    //#endregion

    public Review() {
        this.movie = null;
    }

    public Review(long id, int note, String comment, Movie movie) {
        this.id = id;
        this.rating = note;
        this.comment = comment;
        this.movie = movie;
    }
}

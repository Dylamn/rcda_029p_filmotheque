package fr.eni.movielibrary.bo;

public class Review {
    long id;
    int rating;
    String comment;

    // Relationships
    Movie movie;


    public Review(long id, int note, String comment, Movie movie) {
        this.id = id;
        this.rating = note;
        this.comment = comment;
        this.movie = movie;
    }


}

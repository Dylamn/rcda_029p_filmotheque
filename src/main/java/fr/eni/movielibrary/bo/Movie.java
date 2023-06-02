package fr.eni.movielibrary.bo;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Le titre ne peut pas être vide")
    private String title;

    @Min(value = 1900, message = "L'année doit être supérieure à 1900")
    private int year;

    @Digits(fraction = 6, integer = 3)
    private int duration;

    @NotBlank
    @Size(min = 20, max = 250, message = "Le synopsis doit faire entre 20 et 250 caractères")
    private String synopsis;

    // Relationships
    @ManyToOne
    @NotNull(message = "Un réalisateur doit être sélectionné")
    private Participant producer;

    @ManyToMany
    private List<Participant> actors;

    @OneToOne
    @NotNull(message = "Un genre doit être sélectionné")
    private Genre genre;

    @OneToMany(mappedBy = "movie")
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

    public String getActorsString() {
        StringBuilder actorString = new StringBuilder();

        for (Participant actor :
                this.actors) {
            actorString.append(actor.getFullName()).append("\n");
        }

        return actorString.toString();
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

    //#region Constructors
    public Movie() {
        this.reviews = new ArrayList<>();
        this.genre = new Genre();
        this.producer = new Participant();
        this.actors = new ArrayList<>();
    }

    public Movie(long id, String title, int year, int duration, String synopsis) {
        this();
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
    //#endregion

    @Override
    public String toString() {
        return String.format(
                "<Movie id=%d, title=%s, synopsis=%s, producer=%s, actors=%s, genre=%s>",
                id,
                title,
                synopsis,
                producer.toString(),
                actors.toString(),
                genre.toString()
        );
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }
}

package fr.eni.movielibrary.bo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;

    // Relationships
    @ManyToMany(mappedBy = "actors")
    List<Movie> actorMovies;

    //#region Getters/Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    //#endregion

    public Participant() {

    }
    
    public Participant(long id, String lastname,  String firstname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFullName() {
        return String.format("%s %s", firstname, lastname);
    }



    @Override
    public String toString() {
        return String.format("<Participant id=%d fullname=%s %s>", id, firstname, lastname);
    }
}

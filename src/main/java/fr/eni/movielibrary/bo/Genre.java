package fr.eni.movielibrary.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String label;

    //#region Getters/Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    //#endregion

    public Genre() {

    }

    public Genre(long id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public String toString() {
        return String.format("<Genre id=%d label=%s>", id, label);
    }
}

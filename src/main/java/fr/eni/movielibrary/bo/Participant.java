package fr.eni.movielibrary.bo;

public class Participant {
    private long id;
    private String firstname;
    private String lastname;

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

    public Participant(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("<Participant id=%d fullname=%s %s>", id, firstname, lastname);
    }
}

package fr.eni.movielibrary.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Member {
    long id;
    String firstname;
    String lastname;
    String login;
    String password;
    boolean isAdmin;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    //#endregion

    // Relationships
    List<Review> reviews;

    public Member(long id, String firstname, String lastname, String login, String password, boolean isAdmin) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.reviews = new ArrayList<>();
    }

    public Member(
            long _id, String _firstname, String _lastname, String _login, String _password, boolean _isAdmin,
            List<Review> _reviews
    ) {
        this(_id, _firstname, _lastname, _login, _password, _isAdmin);
        reviews.addAll(_reviews);
    }

    public static Member login(String username, String password, Map<String, Member> fake_db) {
        Member member = fake_db.get(username);
        if (member == null || !member.password.equals(password)) {
            return null;
        }

        return member;
    }
}

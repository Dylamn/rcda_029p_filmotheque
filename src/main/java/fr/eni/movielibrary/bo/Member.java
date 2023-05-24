package fr.eni.movielibrary.bo;

import java.util.ArrayList;
import java.util.List;

public class Member {
    long id;
    String firstname;
    String lastname;
    String login;
    String password;
    boolean isAdmin;

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
}

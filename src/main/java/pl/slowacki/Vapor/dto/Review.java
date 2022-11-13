package pl.slowacki.Vapor.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Review {

    private SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    private User user;
    private int rating;
    private String content;
    private Date dateOfPublication = new Date();

    public Review(User user, int rating, String content, Date dateOfPublication) {
        this.user = user;
        this.rating = rating;
        this.content = content;
        this.dateOfPublication = dateOfPublication;
    }

    public Review() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateOfPublication() {
        return formatter.format(dateOfPublication);
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return rating == review.rating && Objects.equals(user, review.user) && Objects.equals(content, review.content) && Objects.equals(dateOfPublication, review.dateOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, rating, content, dateOfPublication);
    }
}

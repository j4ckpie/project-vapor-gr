package pl.slowacki.Vapor.dto;

import java.util.Objects;

public class Review {

    private User user;
    private int rating;
    private String content;

    public Review(User user, int rating, String content) {
        this.user = user;
        this.rating = rating;
        this.content = content;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return rating == review.rating && Objects.equals(user, review.user) && Objects.equals(content, review.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, rating, content);
    }

}

package pl.slowacki.Vapor.dto;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Game {

    private String name;
    private String description;
    private String developer;
    private String publisher;
    private String[] tags;
    private Review[] reviews;
    private String dateOfPublication;
    private double price;
    private double rating;
    private String systemRequirements;

    public Game(String name, String description, String developer, String publisher, String[] tags, Review[] reviews, String dateOfPublication, double price, double rating, String systemRequirements) {
        this.name = name;
        this.description = description;
        this.developer = developer;
        this.publisher = publisher;
        this.tags = tags;
        this.reviews = reviews;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
        this.rating = rating;
        this.systemRequirements = systemRequirements;
    }

    public Game() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getSystemRequirements() {
        return systemRequirements;
    }

    public void setSystemRequirements(String systemRequirements) {
        this.systemRequirements = systemRequirements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Double.compare(game.price, price) == 0 && Double.compare(game.rating, rating) == 0 && Objects.equals(name, game.name) && Objects.equals(description, game.description) && Objects.equals(developer, game.developer) && Objects.equals(publisher, game.publisher) && Arrays.equals(tags, game.tags) && Arrays.equals(reviews, game.reviews) && Objects.equals(dateOfPublication, game.dateOfPublication) && Objects.equals(systemRequirements, game.systemRequirements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, description, developer, publisher, dateOfPublication, price, rating, systemRequirements);
        result = 31 * result + Arrays.hashCode(tags);
        result = 31 * result + Arrays.hashCode(reviews);
        return result;
    }

}

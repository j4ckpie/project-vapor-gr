package pl.slowacki.Vapor.dto;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class User {

    private String name;
    private Game[] library;
    private Date dateOfRegistration;
    private double balance;

    public User(String name, Game[] library, Date dateOfRegistration, double balance) {
        this.name = name;
        this.library = library;
        this.dateOfRegistration = dateOfRegistration;
        this.balance = balance;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game[] getLibrary() {
        return library;
    }

    public void setLibrary(Game[] library) {
        this.library = library;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.balance, balance) == 0 && Objects.equals(name, user.name) && Arrays.equals(library, user.library) && Objects.equals(dateOfRegistration, user.dateOfRegistration);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, dateOfRegistration, balance);
        result = 31 * result + Arrays.hashCode(library);
        return result;
    }

}

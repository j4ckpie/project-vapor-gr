package pl.slowacki.Vapor.dto;

import java.util.Arrays;
import java.util.Objects;

public class Cart {

    private Game[] games;
    private double totalPrice;

    public Cart(Game[] games, double totalPrice) {
        this.games = games;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Double.compare(cart.totalPrice, totalPrice) == 0 && Arrays.equals(games, cart.games);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(totalPrice);
        result = 31 * result + Arrays.hashCode(games);
        return result;
    }

}

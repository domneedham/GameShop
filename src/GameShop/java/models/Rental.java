package GameShop.java.models;

import java.util.ArrayList;
import java.util.Date;

public class Rental {
    private final int MAX_RENTAL_GAMES = 3;

    private static int idSeed = 1000;
    private int id;
    private Date dateRented;
    private Customer customer;
    private Console console;
    private ArrayList<Game> games = new ArrayList<>();

    public Rental(Date dateRented, Customer customer) {
        id = idSeed;
        this.dateRented = dateRented;
        this.customer = customer;
        idSeed++;
    }

    public Rental(Date dateRented, Customer customer, Console console, ArrayList<Game> games) {
        id = idSeed;
        this.dateRented = dateRented;
        this.customer = customer;
        this.console = console;
        this.games = games;
        idSeed++;
    }

    public int getId() {
        return id;
    }

    public Date getDateRented() {
        return dateRented;
    }

    public void setDateRented(Date dateRented) {
        this.dateRented = dateRented;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int[] getGamesRented() {
        return new int[games.size()];
    }

    public void addGameToRental(Game game) {
        if (games.size() <= MAX_RENTAL_GAMES) {
            games.add(game);
        }
    }

    public void removeGameFromRental(Game game) {
        games.remove(game);
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", dateRented=" + dateRented +
                ", customer=" + customer +
                ", rentalItems=" + games +
                ", console=" + console +
                '}';
    }
}

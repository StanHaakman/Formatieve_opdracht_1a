package gamewinkel;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releasedate;
    private double prijs;

    public Game(String naam, int releasedate, double prijs) {
        this.naam = naam;
        this.releasedate = releasedate;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getReleasedate() {
        return releasedate;
    }

    @Override
    public String toString() {
        return "Game{" +
                "naam='" + naam + '\'' +
                ", releasedate=" + releasedate +
                ", prijs=" + prijs +
                '}';
    }
}

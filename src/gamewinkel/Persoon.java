package gamewinkel;

import java.util.Arrays;

public class Persoon {
    private String naam;
    private int geld;
    private Game[] games;

    void koop(){

    };
    void verkoop(){

    };

    public Persoon(String naam, int geld) {
        this.naam = naam;
        this.geld = geld;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGeld(int geld) {
        this.geld = geld;
    }

    public String getNaam() {
        return naam;
    }

    public int getGeld() {
        return geld;
    }

    public Game[] getGames() {
        return games;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", geld=" + geld +
                ", games=" + Arrays.toString(games) +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

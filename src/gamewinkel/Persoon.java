package gamewinkel;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persoon {
    private String naam;
    private double geld;
    private List<Game> games = new ArrayList<>();

    void koop(Game game) {
        double price = currentPrice(game);

        if (game.getPrijs() <= geld){
            geld = geld - price;
            this.games.add(game);
            System.out.println(MessageFormat.format("{0} koopt {1}: Succesvol", naam, game.getNaam()));
        } else {
            System.out.println(MessageFormat.format("{0} koopt {1}: Mislukt, Onvoldoende geld", naam, game.getNaam()));
        }
    }

    void verkoop(Game game, Persoon persoon){
        double price = currentPrice(game);

        if (games.contains(game) && price <= persoon.getGeld()) {
            games.remove(game);
            persoon.games.add(game);
            persoon.setGeld(persoon.getGeld() - price);
            geld = geld + price;
            System.out.println(MessageFormat.format("{0} verkoopt {1} aan {2}: gelukt", naam, game.getNaam(), persoon.getNaam()));
        } else {
            System.out.println(MessageFormat.format("{0} verkoopt {1} aan {2}: niet gelukt", naam, game.getNaam(), persoon.getNaam()));
        }
    }

    double currentPrice(Game game) {
        double price = game.getPrijs();
        for (int i = 0; i < LocalDate.now().getYear() - game.getReleasedate(); i++) {
            price = price * 0.7;
        }
        return price;
    }

    public Persoon(String naam, int geld) {
        this.naam = naam;
        this.geld = geld;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setGeld(double geld) {
        this.geld = geld;
    }

    public String getNaam() {
        return naam;
    }

    public double getGeld() {
        return geld;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", geld=" + geld +
                ", games=" + games +
                '}';
    }

    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden

        Game g1 = new Game ("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game ("Need for Speed: Rivals", releaseJaar2, 45.99);
        Game g3 = new Game ("Need for Speed: Rivals", releaseJaar2, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon ("Hans", 55);
        Persoon p3 = new Persoon ("Arno", 185);

        p1.koop(g1);
        p1.koop(g2);
        p1.koop(g3);
        p2.koop(g2);
        p2.koop(g1);
        p3.koop(g3);

        p1.verkoop(g1, p3);
        p2.verkoop(g2, p3);
        p2.verkoop(g1, p1);
    }
}

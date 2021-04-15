package gamewinkel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persoon {
    private String naam;
    private int geld;
    private List<Game> games = new ArrayList<Game>();;

    void koop(Game game){
        this.games.add(game);
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

    public void setGames(List<Game> games) {
        this.games = games;
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
    }
}

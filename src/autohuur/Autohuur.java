package autohuur;

public class Autohuur {
    private int aantalDagen;
    private Klant klant;
    private Auto auto;
    private double totaalprijs;

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Klant getKlant() {
        return klant;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    void totaalprijs() {
        totaalprijs = (auto.getPrijsPerDag() * aantalDagen) / 100 * (100 - klant.getKortingsPercentage());
    }

    @Override
    public String toString() {
        return "\nautotype: " + ((auto != null) ? auto.getType(): "geen auto bekend") +
                ",\nop naam van: " + ((klant != null) ? klant.getName(): "geen klant bekend") +
                "\naantal dagen: " + aantalDagen + " en dat kost " + totaalprijs + "\n";
    }

    public static void main(String[] args) {
        Autohuur ah1 = new Autohuur();

        Klant k = new Klant("Mijnheer de Vries");
        k.setKortingsPercentage(10.0);
        System.out.println("Eerste autohuur: " + ah1.toString());
        ah1.setKlant(k);
        System.out.println("Eerste autohuur: " + ah1.toString());

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setAuto(a1);
        ah1.setAantalDagen(4);
        ah1.totaalprijs();
        System.out.println("Eerste autohuur: " + ah1.toString());

        Autohuur ah2 = new Autohuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setAuto(a2);
        ah2.setKlant(k);
        ah2.setAantalDagen(1);
        ah2.totaalprijs();
        System.out.println("Tweede autohuur: " + ah2.toString());

        System.out.println("Gehuurd: " + a1.getType() + "met prijs per dag: " + a1.getType());
        System.out.println("Gehuurd: " + a2.getType() + "met prijs per dag: " + a2.getType());
    }
}

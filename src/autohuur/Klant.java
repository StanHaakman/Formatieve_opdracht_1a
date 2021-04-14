package autohuur;

public class Klant {
    private String name;
    private double kortingsPercentage;

    public Klant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getKortingsPercentage() {
        return kortingsPercentage;
    }

    public void setKortingsPercentage(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "name='" + name + '\'' +
                ", kortingsPercentage=" + kortingsPercentage +
                '}';
    }
}

package autohuur;

public class Auto {
    private String type;
    private double prijsPerDag;

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "type='" + type + '\'' +
                ", prijsPerDag=" + prijsPerDag +
                '}';
    }
}

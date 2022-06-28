package ZivotinjePrimer;

public class Macka extends Zivotinja{
    private String ime;
    private String omiljenoJelo;
    private double prosecnaStarost;

    public Macka(String ime, String omiljenoJelo, double prosecnaStarost) {
        super(ime, omiljenoJelo, prosecnaStarost);
    }

    public void spavaj () {
        System.out.println("Macka spava 15 sati");
    }

    public void jedi() {
        System.out.println("Macka jede sve zivo");
    }
    public void svraljaj() {
        System.out.println("prr prr");
    }
    public void proizvediZvuk() {
        System.out.println("Mjau mjau");
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOmiljenoJelo() {
        return omiljenoJelo;
    }

    public void setOmiljenoJelo(String omiljenoJelo) {
        this.omiljenoJelo = omiljenoJelo;
    }

    public double getProsecnaStarost() {
        return prosecnaStarost;
    }

    public void setProsecnaStarost(double prosecnaStarost) {
        this.prosecnaStarost = prosecnaStarost;
    }
}

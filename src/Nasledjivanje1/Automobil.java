package Nasledjivanje1;

public class Automobil extends MotornoVozilo{
    public String tablica;
    public boolean kabriolet;
    public int brojOsovina;

    public Automobil(String boja, int brojTockova, int brojVrata, String tablica, boolean kabriolet, int brojOsovina) {
        super(boja, brojTockova, brojVrata);
        this.tablica = tablica;
        this.kabriolet = kabriolet;
        this.brojOsovina = brojOsovina;
    }

    public void stampanje() {
        System.out.println("Automobil " + this.boja + " boje ima tablicu " + this.tablica);
        System.out.println("Broj osovina: " + this.brojOsovina);
        System.out.println("Broj tockova: " + this.brojTockova);
        System.out.println("Broj vrata: " + this.brojVrata);
        if (this.kabriolet) {
            System.out.println("Automobil je kabriolet");
        } else {
            System.out.println("Automobil nije kabriolet");
        }
    }
}
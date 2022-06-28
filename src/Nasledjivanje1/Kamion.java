package Nasledjivanje1;

public class Kamion extends MotornoVozilo{
    public boolean prikolica;
    public int visinaKamiona;

    public Kamion(String boja, int brojTockova, int brojVrata, boolean prikolica, int visinaKamiona) {
        super(boja, brojTockova, brojVrata);
        this.prikolica = prikolica;
        this.visinaKamiona = visinaKamiona;
    }

    public void stampanje() {
        System.out.println("Kamion boje " + this.boja + " ima " + this.brojTockova + " tockova i " + this.brojVrata + " vrata.");
        System.out.println("Visina kamiona je " + this.visinaKamiona);
        if (this.prikolica) {
            System.out.println("Kamiona ima prikolicu");
        } else {
            System.out.println("Kamion nema prikolicu");
        }
    }
}
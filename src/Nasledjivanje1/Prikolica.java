package Nasledjivanje1;

public class Prikolica extends Kamion{
    public int duzina;

    public Prikolica(String boja, int brojTockova, int brojVrata, boolean prikolica, int visinaKamiona, int duzina) {
        super(boja, brojTockova, brojVrata, prikolica, visinaKamiona);
        this.duzina = duzina;
    }

    public void stampanje() {
        System.out.println("Prikolica ima " + this.duzina + " metara");
    }
}
package Nasledjivanje1;

public class MainKlasa {
    public static void main(String[] args) {

        MotornoVozilo m1 = new MotornoVozilo("plava", 4, 2);
        m1.stampanje();

        Automobil a1 = new Automobil(m1.boja, m1.brojTockova, m1.brojVrata, "BG-945-YH", false, 2);
        a1.stampanje();

        Kamion k1 = new Kamion(m1.boja, m1.brojTockova, m1.brojVrata, true, 4);
        k1.stampanje();
        Prikolica p1 = new Prikolica(m1.boja, m1.brojTockova, m1.brojVrata, k1.prikolica, k1.visinaKamiona, 3);
        p1.stampanje();
    }
}
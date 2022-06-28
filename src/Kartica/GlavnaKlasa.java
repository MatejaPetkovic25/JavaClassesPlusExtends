package Kartica;

public class GlavnaKlasa {
    public static void main(String[] args) {
       /* MasterKartica k1 = new MasterKartica(200, "7105-5390-5323-0495", 11, 2027);
        k1.stampanje();

        k1.dodajSredstva(10);
        k1.stampanje();*/

        VisaKartica v1 = new VisaKartica(1000, "2535-1234-6464-4322", 11, 2026, "Mateja Petkovic");
        v1.stampanje();
        v1.izvrsiTransakciju(10);
        v1.stampanje();
        v1.izvrsiTransakciju(500);
        v1.stampanje();
        v1.dodajSredstva(500);
        v1.stampanje();

        MasterKartica m1 = new MasterKartica(500, "5325-1352-2352-1241", 04, 2025);
        m1.stampanje();
        m1.odrzavanjeRacuna();
        m1.stampanje();
        m1.izvrsiTransakciju(10);
        m1.stampanje();
        m1.dodajSredstva(124);
        m1.stampanje();

    }
}

package Kartica;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica (double suma, String brojKartice, int mesec, int godina) {
        super(suma, brojKartice, mesec, godina);
    }

    public void izvrsiTransakciju (double placanje) {
        double provizija = placanje * 0.015;
        super.izvrsiTransakciju(placanje + provizija);
    }

    public void odrzavanjeRacuna () {
       super.izvrsiTransakciju(2);
    }

    public void stampanje () {
        System.out.print("Master card: ");
        super.stampanje();
        System.out.println(" ");
    }
}

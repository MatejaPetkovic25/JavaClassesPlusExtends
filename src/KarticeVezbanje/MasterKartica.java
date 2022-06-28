package KarticeVezbanje;

public class MasterKartica extends PlatnaKartica{
    //Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
    //Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
    //Napraviti metodu odrzavanja racuna koja je 2$
    //Implementirati metodu koja stampa karticu u formatu:
    //Master card: 7105-1579-5191-6184, 11/2024, $212

    public MasterKartica(double suma, String brojKartice, int mesec, int godina) {
        super(suma, brojKartice, mesec, godina);
    }

    public void transakcija(double isplata) {
        double provizija = isplata * 0.015;
        super.transakcija(isplata + provizija);
    }

    public void odrzavanjeRacuna(){
        super.transakcija(2);
    }

    public void stampanje() {
        System.out.print("Master kartica: ");
        super.stampanje();
        System.out.println(" ");
    }
}

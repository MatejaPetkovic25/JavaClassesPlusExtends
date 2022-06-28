package KarticeVezbanje;

public class VisaKartica extends PlatnaKartica {
    //Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
    //Napraviti atribut ime i prezime za klasu
    //Geter i seter za atribut
    //Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
    //Najmanja provizija je 4$
    //Implementirati metodu koja stampa karticu u formatu:
    //Visa card: 7105-1579-5191-6184, 11/2024, $212
    private String imeIPrezime;

    public VisaKartica(double suma, String brojKartice, int mesec, int godina, String imeIPrezime) {
        super(suma, brojKartice, mesec, godina);
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void transakcija (double isplata) {
        double provizija = isplata * 0.018;
        if (provizija < 4) {
            super.transakcija(isplata + 4);
        } else {
            super.transakcija(isplata + provizija);
        }
    }

    public void stampanje() {
        System.out.print("Visa kartica: ");
        super.stampanje();
        System.out.println(" " + imeIPrezime);
    }
}

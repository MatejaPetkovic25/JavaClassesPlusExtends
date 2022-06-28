package KarticeVezbanje;

public class PlatnaKartica {
    //Napravi klasu Platna kartica koja ce imati atribute
    //suma, broj kartice, mesec i godina
    //Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
    //Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
    //Metodu koja stampa podatke o kartici u formatu:
    //7105-1579-5191-6184, 11/2024, $212
    //Za klasu Platna kartica napraviti samo getere
    private double suma;
    private String brojKartice;
    private int mesec;
    private int godina;

    public PlatnaKartica(double suma, String brojKartice, int mesec, int godina) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.mesec = mesec;
        this.godina = godina;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void dodajSredstva(double uplata) {
        suma = suma + uplata;
    }

    public void transakcija(double isplata) {
        suma = suma - isplata;
    }

    public void stampanje() {
        System.out.print(brojKartice + ", " + mesec + "/" + godina + ", $" + suma);
    }
}

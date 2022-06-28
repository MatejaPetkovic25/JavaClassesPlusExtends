package Kartica;

public class VisaKartica extends PlatnaKartica{
    private String imePrezime;

    public VisaKartica (double suma, String brojKartice, int mesec, int godina, String imePrezime) {
        super (suma, brojKartice, mesec, godina);
        this.imePrezime = imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void izvrsiTransakciju(double placanje) {
       double provizija = placanje * 0.018;
        if (provizija < 4) {
            super.izvrsiTransakciju(placanje + 4);
        } else {
            super.izvrsiTransakciju(placanje + provizija);
        }
    }

    public void stampanje(){
        System.out.print("Visa card: ");
        super.stampanje();
        System.out.println(", " + getImePrezime());
    }
}

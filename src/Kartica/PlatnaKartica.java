package Kartica;

public class PlatnaKartica {
    private double suma;
    private String brojKartice;
    private int mesec;
    private int godina;

    public PlatnaKartica (double suma, String brojKartice, int mesec, int godina) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.mesec = mesec;
        this.godina = godina;
    }

    public void dodajSredstva (double dodatak) {
        suma = suma + dodatak;
    }

    public void izvrsiTransakciju (double placanje){
        suma = suma - placanje;
    }

    public void stampanje () {
        System.out.print(brojKartice + ", " + mesec + "/" + godina + ", $" + suma);
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getMesec () {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

}

package InterfejsiPocetak;

public abstract class Ptica {
    private String ime;
    private double rasponKrila;

    public Ptica(String ime, double rasponKrila) {
        this.ime = ime;
        this.rasponKrila = rasponKrila;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    public abstract void rodiSe ();

    public String toString() {
        //return "Cao ja sam vrabac";
        return "Ime: " + getIme() + "\nRaspon krila: " + getRasponKrila();
    }

}

package InterfejsiPocetak;

import java.util.ArrayList;

public class Orao extends Ptica implements Hrani, Leti, Pevaj{
    private String ime;
    private double rasponKrila;
    ArrayList<String> omiljenaHrana;

    public Orao(String ime, double rasponKrila, ArrayList<String> omiljenaHrana) {
        super(ime, rasponKrila);
        this.omiljenaHrana = omiljenaHrana;
    }

    @Override
    public void rodiSe() {
        System.out.println("Orao je rodjen.");
    }

    @Override
    public void pevaj() {
        System.out.println("Orao peva skrrrr skrrrr");
    }


}

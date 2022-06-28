package InterfejsiPocetak;

import java.util.ArrayList;

public class Vrabac extends Ptica{

    ArrayList<String> omiljenaHrana;

    public Vrabac(String ime, double rasponKrila, ArrayList<String> omiljenaHrana) {
        super(ime, rasponKrila);
        this.omiljenaHrana = omiljenaHrana;
    }
    public void rodiSe() {
        System.out.println("Vrabac je rodjen.");
    }





}
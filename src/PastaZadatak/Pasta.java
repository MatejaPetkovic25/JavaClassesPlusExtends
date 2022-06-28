package PastaZadatak;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> listaSastojaka;

    public Pasta () {
        listaSastojaka = new ArrayList<Sastojak>();
    }

    public void dodavanje (Sastojak s) {
        listaSastojaka.add(s);
    }

    public void brisanje (Sastojak s) {
        listaSastojaka.remove(s);
    }

    public double cenaPaste (ArrayList<Sastojak> listaSastojaka) {
        double cenaPaste = 0;
        for (int i = 0; i < listaSastojaka.size(); i++) {
           cenaPaste = cenaPaste + listaSastojaka.get(i).getCena();
        }
        return cenaPaste;
    }

    public void stampanje () {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < listaSastojaka.size(); i++) {
            listaSastojaka.get(i).stampanje();
        }
        System.out.println("Cena paste je " + cenaPaste(listaSastojaka) + " din.");
    }
}

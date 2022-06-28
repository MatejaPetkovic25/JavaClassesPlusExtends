package InterfejsiPocetak;

import java.util.ArrayList;

public class TestPtice {
    public static void main(String[] args) {
        ArrayList<String> omiljenaHrana = new ArrayList<>();
        omiljenaHrana.add("crvic");
        omiljenaHrana.add("hlebic");
       // System.out.println(omiljenaHrana);
        Vrabac vrabcic = new Vrabac("vrabcic", 10.0, omiljenaHrana);

        //System.out.println(vrabcic);
        Object o = new Object();
        //o.toString() // iz objekat klase
        ArrayList<String> oraoHrana = new ArrayList<>();
        oraoHrana.add("Zmija");
        oraoHrana.add("Ovca");
        oraoHrana.add("Manje ptice");

        Orao orlic = new Orao("Habib", 210.0, oraoHrana);

        System.out.println(orlic);
        System.out.println(vrabcic);


    }
}

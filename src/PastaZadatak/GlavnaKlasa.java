package PastaZadatak;

public class GlavnaKlasa {
    //Kreirati klasu Sastojak koja ima naziv, cenu, getere i setere, konstruktore,
    // metodu za stampanje koja stampa u formatu - naziv - cena.din
    //Kreirati klasu Pasta koja ima:
    //listu sastojaka
    //metodu dodavanja sastojaka
    //metodu za brisanje sastojaka. U metodu se salje naziv sastojka koji se brise
    //defaultni konstruktor
    //metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
    //metodu za stampu koja stampa podatke u formatu:
    //Pasta je sa sastojcima:
    //naziv - cena.din
    //naziv - cena.din
    //Cena paste je cena.din
    public static void main(String[] args) {
        Sastojak prvi = new Sastojak("Paradajz sok", 115);
       // prvi.stampanje();
        Sastojak drugi = new Sastojak("Mleveno meso", 200);
        Sastojak treci = new Sastojak("Parmezan", 160);

        Sastojak prviA = new Sastojak("Pavlaka za kuvanje", 170);
        Sastojak drugiA = new Sastojak("Slanina", 270);
        Sastojak treciA = new Sastojak("Jaja", 20);


        Pasta Bolonjeze = new Pasta();
        System.out.println("Bolonjeze");
        Bolonjeze.dodavanje(prvi);
        Bolonjeze.dodavanje(drugi);
        Bolonjeze.dodavanje(treci);
        Bolonjeze.stampanje();
        System.out.println("----------------------");
        System.out.println("Karbonara");

        Pasta Karbonara = new Pasta();
        Karbonara.dodavanje(prviA);
        Karbonara.dodavanje(prvi);
        Karbonara.dodavanje(drugiA);
        Karbonara.dodavanje(treciA);
        Karbonara.brisanje(prvi);
        Karbonara.dodavanje(treci);
        Karbonara.stampanje();
    }
}

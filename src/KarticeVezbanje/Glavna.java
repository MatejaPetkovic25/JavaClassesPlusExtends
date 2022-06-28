package KarticeVezbanje;

public class Glavna{
//Sve platne kartice na sebi imaju mesec, godinu, broj kartice i sumu. Visa kartica ima jos i ime i prezime.
//Napraviti metodu koja moze da dodaje sredstva i da vrsi transakcije. Podaci ne mogu da se podese, mogu samo da se citaju.
//Visa kartica ima proviziju od 1.8% transakcije, a minimalna provizija je 4$.
//Master kartica ima proviziju od 1.5% transakcije i mesecno odrzavanje kosta 2$.
//Kartica treba da prikazuje podatke u formatu:
//Tip kartice: broj racuna, mesec/godina, stanje racuna, ime i prezime vlasnika kartice

    public static void main(String[] args) {
        VisaKartica vk1 = new VisaKartica(0, "2345-2456-7785-1023", 10, 2026, "Dragce Jovanovic");
        MasterKartica mk1 = new MasterKartica(1735, "3523-1235-6575-3437", 11, 2027);

        vk1.stampanje();
        System.out.println("------------");
        mk1.stampanje();
        System.out.println("------------");

        vk1.dodajSredstva(120000);
        vk1.transakcija(1000);
        vk1.stampanje();
        System.out.println("------------");
        mk1.transakcija(150);
        mk1.stampanje();



    }
}

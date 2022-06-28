package FejsbukReakcije;

import java.util.ArrayList;

public class GlavnaKlasa {
//Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima
public static void main(String[] args) {


    ArrayList<Reakcije> reakcijeNaPost = new ArrayList<Reakcije>();


    Reakcije r1 = new Reakcije("smajli", "Gojko Gojkovic");
    Reakcije r2 = new Reakcije("like", "Franko Stajn");
    Reakcije r3 = new Reakcije("srce", "Pera Peric");
    Reakcije r4 = new Reakcije("srce", "Stefan Stefanovic");
    Reakcije r5 = new Reakcije("smajli", "Boba Fet");
    Reakcije r6 = new Reakcije("smajli", "Boban Rajovic");
    Reakcije r7 = new Reakcije("smajli", "Jokara Nikolic");
    Reakcije r8 = new Reakcije("smajli", "Ofkan Terzic");
    Reakcije r9 = new Reakcije("smajli", "Robert de Niro");
    Reakcije r10 = new Reakcije("like", "Zulu Ratnik");
    Reakcije r11 = new Reakcije("like", "Stipe Pletikosa");
    Reakcije r12 = new Reakcije("like", "Djuro Djuric");
    Reakcije r13 = new Reakcije("like", "Bosko Balaban");
    Reakcije r14 = new Reakcije("like", "Pantela Mare");
    Reakcije r15 = new Reakcije("like", "Skuba Dajver");

    FacebookPost fb = new FacebookPost("Mitar Mitrovic", "Precasni Musaka od tog dana vise nikada nije bio isti",
            reakcijeNaPost);
    fb.reaguj(r1);
    fb.reaguj(r2);
    fb.reaguj(r3);
    fb.reaguj(r4);
    fb.reaguj(r5);
    fb.reaguj(r6);
    fb.reaguj(r7);
    fb.reaguj(r8);
    fb.reaguj(r9);
    fb.reaguj(r10);
    fb.reaguj(r11);
    fb.reaguj(r12);
    fb.reaguj(r13);
    fb.reaguj(r14);
    fb.reaguj(r15);

    System.out.println(fb);

}

}

package Vezbanje1;

import java.util.ArrayList;

public class MainKlasa {
    public static void main(String[] args) {

       /* JednakostranicniTrougao t1 = new JednakostranicniTrougao(3);
        System.out.println("Obim: " + t1.obim());
        System.out.println("Povrsina: " + t1.povrsina());
        System.out.println("---------------");

        PravougliTrougao t2 = new PravougliTrougao(3, 4, 5);
        System.out.println("Obim: " + t2.obim());
        System.out.println("Povrsina: " + t2.povrsina());
        System.out.println("---------------");

        JednakokrakiTrougao t3 = new JednakokrakiTrougao(5, 6);
        System.out.println("Obim: " + t3.obim());
        System.out.println("Povrsina: " + t3.povrsina());
        System.out.println("---------------");*/
        Trougao trougao = new JednakostranicniTrougao(2); //dete klasa moze biti tipa roditelj klase
       // JednakostranicniTrougao trougao1 = new Trougao(2, 2, 2); roditelj klasa ne moze biti tipa dete klasa

        Trougao t4 = new JednakostranicniTrougao(5);
        Trougao t5 = new JednakokrakiTrougao(5, 12);
        Trougao t6 = new PravougliTrougao(3, 4, 5);
       // Trougao t7 = new Trougao(1, 2, 3); Ne moze da se deklarise nista u abstraktnoj klasi

        ArrayList<Trougao> trouglovi = new ArrayList<>();
        trouglovi.add(t4);
        trouglovi.add(t5);
        trouglovi.add(t6);
       // trouglovi.add(t7);

        //pojacana for petlja, enhanced for

        for(Trougao trougaoUnutarListeTrouglovi : trouglovi) {
            System.out.println("Obim je: " + trougaoUnutarListeTrouglovi.obim());
            System.out.println("Povrsina je: " + trougaoUnutarListeTrouglovi.povrsina()); //polimofrizam
            //jedan objekat moze na sebe da prihvati vise nekakvih formi

        }



    }
}

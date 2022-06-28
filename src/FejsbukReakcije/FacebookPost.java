package FejsbukReakcije;

import java.util.ArrayList;

public class FacebookPost {
//Kreirati klasu FacebookPost koja ima:
//ime i prezime korisnika koji je stavio objavu
//tekst objave
//listu reakcija
//metodu reaguj, koja dodaje reakciju u niz
//privatnu metodu koja vraca broj reakcija odredjenog tipa
// (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//metodu stampaj koja stampa info o postu u formatu:
//
//Dragoljub Boranijasevic
//Test ce biti u cetvrtak
//smajli 10 | like 15 | srce 2

    private String imePrezimeAutora;
    private String tekstObjave;
    private ArrayList<Reakcije> listaReakcija;

    public FacebookPost(String imePrezimeAutora, String tekstObjave, ArrayList<Reakcije> listaReakcija) {
        this.imePrezimeAutora = imePrezimeAutora;
        this.tekstObjave = tekstObjave;
        this.listaReakcija = listaReakcija;
    }
    public void reaguj (Reakcije r) {
        listaReakcija.add(r);
    }
    private int brojReakcija (String tipReakcije) {
        int brojac = 0;
        for(int i = 0; i < listaReakcija.size(); i++) {
            if (listaReakcija.get(i).getTipReakcije().equals(tipReakcije)) {
                brojac ++;
            }
        }
        return brojac;
    }
    public String toString() {
        return imePrezimeAutora + "\n" + tekstObjave + "\nsmajli " + brojReakcija("smajli") + " | " + "like "
                + brojReakcija("like") + " | " + "srce " + brojReakcija("srce");
    }
}

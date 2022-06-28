package VezbanjeSah;

public class Polje {
    //1. Класа Polje представља једно поље на шаховској табли.
    //Садржи:
    //- две инстанцне променљиве које означавају координате позиције поља на табли. Прва
    //координата узима вредности из скупа {‟A‟, ‟B‟, ‟C‟, ‟D‟, ‟E‟, ‟F‟, ‟G‟, ‟H‟}, а друга из скупа {‟1‟,
    //‟2‟, ‟3‟, ‟4‟, ‟5‟, ‟6‟, ‟7‟, ‟8‟}
    //- трећа инстанцна променљива означава да ли се на пољу налази фигура.
    //Имплементирати:
    //- конструктор са вредностима за координате поља на табли
    //- метод за проверу исправности координата поља
    //- неопходне get*() и set*() методе
    //- метод који враћа String- репрезентацију поља (нпр. “A3”, “B6”, “G8”)
    private char red;
    private int kolona;
    boolean daLiImaFigura;

    public Polje(char red, int kolona, boolean daLiImaFigura) {
        this.red = red;
        this.kolona = kolona;
        this.daLiImaFigura = daLiImaFigura;
    }

    public char getRed() {
        return red;
    }

    public void setRed(char red) {
        this.red = red;
    }

    public int getKolona() {
        return kolona;
    }

    public void setKolona(int kolona) {
        this.kolona = kolona;
    }

    public boolean isDaLiImaFigura() {
        return daLiImaFigura;
    }

    public void setDaLiImaFigura(boolean daLiImaFigura) {
        this.daLiImaFigura = daLiImaFigura;
    }
}

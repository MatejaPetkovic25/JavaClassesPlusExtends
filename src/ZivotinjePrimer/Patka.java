package ZivotinjePrimer;

public class Patka extends Zivotinja {

    public Patka(String ime, String omiljenoJelo, double prosecnaStarost) {
        super(ime, omiljenoJelo, prosecnaStarost);
    }

    public void spavaj() {
        System.out.println("Patka spava 4 sata.");
    }
    public void jedi () {
        System.out.println("Patka jede crve.");
    }
    public void svraljaj() {
        System.out.println("Patka pliva okolo");
    }
    public void proizvediZvuk() {
        System.out.println("kva-kva");
    }


}

package ZivotinjePrimer;

public abstract class Zivotinja {
    private String ime;
    private String omiljenoJelo;
    private double prosecnaStarost;

    public Zivotinja(String ime, String omiljenoJelo, double prosecnaStarost) {
        this.ime = ime;
        this.omiljenoJelo = omiljenoJelo;
        this.prosecnaStarost = prosecnaStarost;
    }
    public void spavaj(){
        System.out.println("Hrkanje zzzzzzzzz");
    }
    public abstract void jedi ();
    public abstract void svraljaj();
    public abstract void proizvediZvuk();



}

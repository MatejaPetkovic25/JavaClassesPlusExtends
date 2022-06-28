package Vezbanje1;

public abstract class Trougao {
    private double a;
    private double b;
    private double c;

    public Trougao (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double obim() {
        return a + b + c;
    }

    public abstract double povrsina();

    //geteri
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
}

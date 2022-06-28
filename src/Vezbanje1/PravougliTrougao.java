package Vezbanje1;

public class PravougliTrougao extends Trougao {

    public PravougliTrougao (double kateta1, double kateta2, double hipotenuza) {
        super(kateta1, kateta2, hipotenuza);
    }

    public double povrsina() {
        return super.getA() * super.getB() / 2;
    }


}

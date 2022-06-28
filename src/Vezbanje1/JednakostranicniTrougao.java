package Vezbanje1;

public class JednakostranicniTrougao extends Trougao {

    public JednakostranicniTrougao(double a) {
        super(a, a, a);
    }

    public double povrsina() {
        return super.getA() * super.getA() * Math.sqrt(3) / 4;
    }

}




package Vezbanje1;

public class JednakokrakiTrougao extends Trougao {

    public JednakokrakiTrougao(double osnovica, double kraci) {
        super (osnovica, kraci, kraci);
    }
    public double povrsina() {
        return 0.5 * super.getA() * Math.sqrt(( super.getB() + 0.5 * super.getA()) + (super.getB() - 0.5 * super.getA()));
    }


}

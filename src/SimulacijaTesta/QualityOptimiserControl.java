package SimulacijaTesta;

public class QualityOptimiserControl extends Control{
    private int internet;

    public QualityOptimiserControl(int internet) {
        this.internet = internet;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {
        double Mbps = this.internet * 8.4;
        //Granice kvaliteta zvuka su 144, 240, 360, 480, 720 i 1080
        if (Mbps >= 1080) {
            vp.setKvalitetVidea(1080);
        } else if (Mbps >= 720) {
            vp.setKvalitetVidea(720);
        } else if (Mbps >= 480) {
            vp.setKvalitetVidea(480);
        } else if (Mbps >= 360) {
            vp.setKvalitetVidea(360);
        } else if (Mbps >= 240) {
            vp.setKvalitetVidea(240);
        } else {
            vp.setKvalitetVidea(144);
        }
    }
}

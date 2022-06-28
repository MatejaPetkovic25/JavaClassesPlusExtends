package FejsbukReakcije;

public class Reakcije {
//Kreirati klasu Reakcija koja ima tip reakcije (smajli, like, srce), ime i prezime korisnika koji je reagovao,
// getere, setere i konstruktore.

        private String tipReakcije;
        private String imePrezime;

    public Reakcije(String tipReakcije, String imePrezime) {
        this.tipReakcije = tipReakcije;
        this.imePrezime = imePrezime;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}

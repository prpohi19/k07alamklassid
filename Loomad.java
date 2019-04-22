public class Loomad {

    String nimi;
    String suurus;
    int vanus;

    public Loomad(String nimi, String suurus, int vanus) {
        this.nimi = nimi;
        this.suurus = suurus;
        this.vanus = vanus;
    }

    public void häälitse() {
        System.out.println("Loom häälisteb");
    }

}

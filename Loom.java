public abstract class Loom {
    int vanus;
    int kaal;
    String v2rv;

    public Loom(int vanus, int kaal, String v2rv) {
        this.vanus=vanus;
        this.kaal=kaal;
        this.v2rv=v2rv;
    }

    public void teeHaalt(){
        System.out.println("igal loomal on oma häälitsus");
    }
    public void info(){
        System.out.println("looma tutvustus");
    }
}

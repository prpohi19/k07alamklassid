public class Main {

    public static void main(String[] args) {

        Loom koer=new Koer(10, 15, "must");
        Loom kass=new Kass(5, 6, "valge");

        koer.info();
        koer.teeHaalt();
        kass.info();
        kass.teeHaalt();
    }
}

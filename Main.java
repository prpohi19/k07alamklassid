public class Main {

    public static void main(String[] args) {
        miniLoomad jänku = new miniLoomad("juss", "mini", 30);
        jänku.häälitse();
        jänku.peida();
        suuredLoomad karu = new suuredLoomad("Puhh", "tohutu", 100);
        karu.häälitse();
        karu.ajaJahimeestTaga();
    }


}

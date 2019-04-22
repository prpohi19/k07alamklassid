public class suuredLoomad extends Loomad {

    public suuredLoomad(String nimi, String suurus, int vanus) {
        super(nimi, suurus, vanus);
    }

    @Override
    public void häälitse() {
        System.out.println("Suur loom ei taha häält teha!!!!!!!!!!!!!!!!");
    }

    public void ajaJahimeestTaga() {
        System.out.println("Jahimehel läheb halvasti");
    }
}

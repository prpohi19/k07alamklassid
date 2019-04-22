public class miniLoomad extends Loomad {

    public miniLoomad(String nimi, String suurus, int vanus) {
        super(nimi, suurus, vanus);
    }

    public void peida() {
        System.out.println(nimi + " pistab peitu!");
    }
}

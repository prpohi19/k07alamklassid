public class Kass extends Loom {
    public Kass(int vanus, int kaal, String v2rv){
        super(vanus, kaal, v2rv);
    }

    @Override
    public void teeHaalt(){
        System.out.println("mjäu mjäu");
    }

    @Override
    public void info() {
        System.out.println("Olen "+vanus+" aastane kass, kaalun "+kaal+" kg ja mu värv on "+v2rv);
    }
}
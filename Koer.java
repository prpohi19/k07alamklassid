public class Koer extends Loom {
    public Koer(int vanus, int kaal, String v2rv){
        super(vanus, kaal, v2rv);
    }

    @Override
    public void teeHaalt(){
        System.out.println("auh auh");
    }

    @Override
    public void info() {
        System.out.println("Olen "+vanus+" aastane koer, kaalun "+kaal+" kg ja mu värv on "+v2rv);
    }
}

public class Opilane extends Kooliskaija {
    public Opilane(String nimi, String ylesanne, Haridus haridus, Instituut instituut) {
        super(nimi, ylesanne, haridus, instituut);
    }

    @Override
    public void hindeSeos(Hinne h) {
        System.out.println("Mina - " + nimi + " sain hindeks " + h + "!");
    }
}

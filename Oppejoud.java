public class Oppejoud extends Kooliskaija {
    public Oppejoud(String nimi, String ylesanne, Haridus haridus, Instituut instituut) {
        super(nimi, ylesanne, haridus, instituut);
    }

    @Override
    public void hindeSeos(Hinne h) {
        System.out.println("Mina - " + nimi + " panin õpilasele hinde " + h + "!");
    }


}

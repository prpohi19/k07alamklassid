public abstract class Kooliskaija {
    String nimi;
    Haridus haridus;
    String ylesanne;
    Instituut instituut;

    public Kooliskaija(String nimi, String ylesanne, Haridus haridus, Instituut instituut) {
        this.nimi = nimi;
        this.ylesanne = ylesanne;

        if (haridus != null) { this.haridus = haridus; }
        if (instituut != null) { this.instituut = instituut; }
    }

    public void tutvustaEnd() {
        System.out.println("Tere, mina olen " + nimi + " ning ma " + ylesanne + ".");
    }

    public void tutvustaHaridust() {
        System.out.println("Ma olen " + haridus + " haridusega ning käin " + instituut + " instituudis.");
    }

    abstract public void hindeSeos(Hinne h);
}

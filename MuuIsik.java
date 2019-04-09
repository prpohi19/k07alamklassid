public class MuuIsik extends Kooliskaija {
    public MuuIsik(String nimi, String ylesanne, Haridus haridus, Instituut instituut) {
        super(nimi, ylesanne, haridus, instituut);
    }

    MuuIsik(String nimi, String ylesanne, Haridus haridus) {
        super(nimi, ylesanne, haridus, null);
    }

    MuuIsik(String nimi, String ylesanne, Instituut instituut) {
        super(nimi, ylesanne, null, instituut);
    }

    MuuIsik(String nimi, String ylesanne) {
        super(nimi, ylesanne, null, null);
    }

    @Override
    public void hindeSeos(Hinne h) {
        System.out.println("Mulle - " + nimi + " - pole hindeid vaja!");
    }

    @Override
    public void tutvustaHaridust() {
        String tutvustus = "";

        if (haridus == null){
            tutvustus += "Minu haridus pole sinu asi";
        }
        else {
            tutvustus += "Minu hariduseks on " + haridus;
        }

        if (instituut == null){
            tutvustus += " ja ma käin igas instituudis.";
        }
        else {
            tutvustus += " ja ma käin " + instituut + " instituudis.";
        }
        System.out.println(tutvustus);
    }
}

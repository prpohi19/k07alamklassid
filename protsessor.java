public class protsessor {
    String mudel;
    double sagedus;
    int tuumad;
    protected String Tootja;

    public protsessor (String Mudel, double Sagedus, int Tuumad) {
        mudel = Mudel;
        sagedus = Sagedus;
        tuumad = Tuumad;
    }
    public String getTootja() {
        return Tootja;
    }

    public void specs(){
        System.out.println("Sellel "+Tootja+" "+mudel+" protsessoril on "+tuumad+" tuuma ja töötamissagedus on "+sagedus+" GHz");

    }
}
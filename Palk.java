public abstract class Palk {
    String nimi;
    Integer bruto;
    public Palk(String nimi, Integer bruto){
        this.nimi = nimi;
        this.bruto = bruto;
    }

    public void kirjeldus(){
        System.out.println("Minu nimi on "+nimi);
    }

    abstract public double arvestaMaksud();

}

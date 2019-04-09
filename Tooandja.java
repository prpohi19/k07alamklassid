public class Tooandja extends Palk {


    public Tooandja(String nimi, Integer bruto) {
        super(nimi, bruto);
    }

    @Override
    public double arvestaMaksud() {
        double kulu = bruto+(bruto*0.33)+(bruto*0.008);
        return kulu;
    }
}

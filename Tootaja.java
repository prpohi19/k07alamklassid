public class Tootaja extends Palk {
    Double tulumaksuvabastus;

    public Tootaja(String nimi, Integer bruto, Double tulumaksuvabastus) {
        super(nimi, bruto);
        this.tulumaksuvabastus = tulumaksuvabastus;
    }

    public double maksuvabaTulu(){
        double maksuvabatulu = 0;
        if (bruto <= 1200) {
            maksuvabatulu = 500;
            if (tulumaksuvabastus < maksuvabatulu){
                maksuvabatulu = tulumaksuvabastus;
            }
        } else if (bruto <= 2100) {
            maksuvabatulu = (6000 - (6000.0 / 10800 * (bruto * 12 - 14400))) / 12;
            if (tulumaksuvabastus < maksuvabatulu) {
                maksuvabatulu = tulumaksuvabastus;
            }
        }
        return maksuvabatulu;
    }

    @Override
    public double arvestaMaksud() {
        double palk = bruto;
        double maksuvabatulu = 0;
        palk = palk - (palk * 0.02) - (palk * 0.016);
        if (bruto <= 1200) {
            maksuvabatulu = 500;
            if (tulumaksuvabastus < maksuvabatulu){
                maksuvabatulu = tulumaksuvabastus;
            }
            if(bruto >=maksuvabatulu){
                palk = ((palk-maksuvabatulu)*0.8)+maksuvabatulu;
            }
        } else if (bruto <= 2100) {
            maksuvabatulu = (6000 - (6000.0 / 10800 * (bruto * 12 - 14400))) / 12;
            if (tulumaksuvabastus < maksuvabatulu){
                maksuvabatulu = tulumaksuvabastus;
            }
            palk = ((palk - maksuvabatulu) * 0.8) + maksuvabatulu;
        } else {
            palk = (palk * 0.8);
        }
        return palk;
    }
}

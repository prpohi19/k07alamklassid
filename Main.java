public class Main {

    public static void main(String[] args) {
        TavaAutod Mazda = new TavaAutod("Mazda", 180, 2005);
        SportAutod Koenigseeg = new SportAutod("Koenigsegg", 350, 2012);
        Masinad[] autod = new Masinad[2];
        autod[0] = Mazda;
        autod[1] = Koenigseeg;

        for(Masinad i: autod){
            System.out.println(i.mark + " maksimaalne kiirus on " + i.tipKiirus + "ning on toodetud aastal " + i.vanus);
            if (i.tipKiirus < 200){
                Mazda.käivitus();
                Mazda.roostetab();
            } else {
                Koenigseeg.käivitus();
                Koenigseeg.kiirendab();
            }
        }
    }

}
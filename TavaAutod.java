public class TavaAutod extends Masinad{

    public TavaAutod(String Mark, int kmh, int tootmisAasta) {
        super(Mark, kmh, tootmisAasta);
    }

    @Override
    public void käivitus() {
        System.out.println("vaikne vroom vroom");
    }

    public void roostetab(){
        System.out.println("Auto jälle roostetab");
    }
}

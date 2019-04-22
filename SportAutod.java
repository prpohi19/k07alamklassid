public class SportAutod extends Masinad{

    public SportAutod(String Mark, int kmh, int tootmisAasta) {
        super(Mark, kmh, tootmisAasta);
    }

    @Override
    public void käivitus() {
        System.out.println("vali VROOM VROOM");
    }

    public void kiirendab(){
        System.out.println("Ületan kiiruspiirangu kahe sekundiga");
    }
}

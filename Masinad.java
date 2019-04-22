public class Masinad {
    String mark;
    int tipKiirus;
    int vanus;

    public Masinad(String Mark, int kmh, int tootmisAasta){
        mark = Mark;
        tipKiirus = kmh;
        vanus = tootmisAasta;
    }

    public void käivitus(){
        System.out.println("VROOM VROOM");
    }

}

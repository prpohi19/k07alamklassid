package Kodutöö7;

public class Nutitelefon extends Telefonid {
    public Nutitelefon(String mark, String värvus, int hind) {
        super(mark, värvus, hind);
    }

    @Override
    public void Heli() {
        super.Heli();
    }

    @Override
    public void Mark() {
        super.Mark();
    }
    public void internet(){
        System.out.println("Nutitelefoniga saab internetis surfata");
    }
}

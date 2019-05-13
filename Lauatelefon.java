package Kodutöö7;

public class Lauatelefon extends Telefonid {
    public Lauatelefon(String mark, String värvus, int hind) {
        super(mark, värvus, hind);
    }

    @Override
    public void Heli() {
        System.out.println("Laua telefon teeb teistsugust häält kui nutitelefon");
    }
}

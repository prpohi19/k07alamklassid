package Kodutöö7;

public class Main{
    public static void main(String[] args) {
        Telefonid samsung = new Nutitelefon("Galaxy", "sinine", 600);
        ((Nutitelefon) samsung).internet();
        samsung.Heli();
        Telefonid lauatelefon = new Lauatelefon("kiviaeg", "pruun", 5);
        lauatelefon.Heli();
    }

}

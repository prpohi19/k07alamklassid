package Kodutöö7;

public class Telefonid {
    String mark;
    String värvus;
    int hind;

    public Telefonid(String mark, String värvus, int hind) {
        this.mark = mark;
        this.värvus = värvus;
        this.hind = hind;
    }
    public void Heli(){
        System.out.println("Kõik telefonid helisevad");
    }
    public void Mark(){
        System.out.println("Telefon on " + mark);
    }
}

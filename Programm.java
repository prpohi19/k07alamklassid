public class Programm {
    public static void main(String[] args){
        Palk kati = new Tootaja("Kati",900, 350.0);
        Palk kalle = new Tootaja("Kalle",1100, 700.0);
        Palk boss = new Tooandja("Kerlo", 900);
        Palk[] palgad = {new Tooandja("Kerlo", 900), new Tooandja("Kerlo", 13000), new Tootaja("Kalle",1100, 700.0), new Tootaja("Kati",900,350.0), new Tootaja("Kerlo", 1300, 500.0)};
        kati.kirjeldus();
        System.out.println(kati.nimi+" tulumaksuvabastus on " +((Tootaja) kati).maksuvabaTulu());
        System.out.println(kalle.nimi+" tulumaksuvabastus on " +((Tootaja) kalle).maksuvabaTulu());
        boss.kirjeldus();
        System.out.println(kati.nimi+" netopalk on: "+kati.arvestaMaksud());
        System.out.println(boss.nimi+" kulu kokku on: "+boss.arvestaMaksud());
        System.out.println("Tootajate keskmine bruto on"+Tehted.keskmineBrutoPalk(palgad));
        System.out.println("Tootajate keskmine neto on "+Tehted.keskmineNetoPalk(palgad));
    }
}

public class Main {
    public static void main(String[] args){
        Archer arch = new Archer("Samuel"); arch.attackPower= 3; arch.health=65.0;
        Warrior warr = new Warrior("Carolyn"); warr.attackPower= 2;
        Wizard wiz= new Wizard("Magister"); wiz.attackPower= 4; wiz.health= 50.0;


        wiz.attack(warr);
        warr.attack(wiz);
        arch.attack(warr);
        warr.attack(arch);
        System.out.println("-----------------------------------------------------");
        System.out.println("Pärast lahingut on elupunkte alles ");
        System.out.println(arch.getName()+": "+arch.getHealth()+"hp || "+warr.getName()+": "+warr.getHealth()+"hp || "+wiz.getName()+": "+wiz.getHealth()+"hp" );
/*
Samuel otsib nooli, et võidelda.
Magister tabab tegelast Carolyn loitsuga. || Carolyn kaotab 4 elupunkti.
Carolyn lööb tegelast Magister mõõgaga. || Magister kaotab 2 elupunkti.
Samuel laseb tegelast Carolyn nooltega. || Carolyn kaotab 3 elupunkti.
Carolyn lööb tegelast Samuel mõõgaga. || Samuel kaotab 2 elupunkti.
-----------------------------------------------------
Pärast lahingut on elupunkte alles
Samuel: 63.0hp || Carolyn: 93.0hp || Magister: 48.0hp
*/
    }
}

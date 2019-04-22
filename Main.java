public class Main{
  public static void main(String[] args){
    System.out.println("Hakkab pihta");
    System.out.println();
    Purjekas purjekas = new Purjekas("Vaikne","Väike","Mitte väga kiire","Suhteliselt ebamugav");
    Mootorpaat mpaat = new Mootorpaat("Lärmakas", "Keskmine", "Kiire", "Väga ebamugav");
    Veesõiduk[] veesõidukid = new Veesõiduk[2];
    veesõidukid[0] = purjekas;
    veesõidukid[1] = mpaat;

    for(Veesõiduk m: veesõidukid){
      System.out.println("Müra poolest olen "+m.müra);
      System.out.println("Minu kütusekulu on "+m.kulu);
      System.out.println("Ma olen "+m.kiirus);
      System.out.println("Minuga sõita on "+m.mugavus);
      System.out.println();
    }







  }

}
/*Hakkab pihta

Müra poolest olen Vaikne
Minu kütusekulu on Väike
Ma olen Mitte väga kiire
Minuga sõita on Suhteliselt ebamugav

Müra poolest olen Lärmakas
Minu kütusekulu on Keskmine
Ma olen Kiire
Minuga sõita on Väga ebamugav
*/

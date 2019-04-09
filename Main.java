public class Main{
    public static void main(String[] args){
      Pet p1 = new Dog(7, 5, "Matu");
      Pet p2 = new Cat(5, 4, "Liisu");
      Pet[] shelter = {new Dog(11, 2, "Rex"), new Cat(3, 7, "Ruudi"), new Cat(6, 2, "Aadu")};
      System.out.println(p1.Hello());
      System.out.println(p1.Age());
      System.out.println("****************");
      System.out.println(p2.Hello());
      System.out.println(p2.Age());
      System.out.println("****************");
      System.out.println("Varjupaigas on " + shelter.length + " looma!");
    }
  }

/* 
Mina olen koer Matu ja minu sabapikkus on 7.0 cm!
Ma olen 5 aastane!
****************
Mina olen kass Liisu ja minu sabapikkus on 5.0 cm!
Ma olen 4 aastane!
****************
Varjupaigas on 3 looma!
*/

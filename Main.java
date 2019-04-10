public class Main{
    public static void main(String[] args){
      Pet a1 = new Dog(7, 5, "Matu");
      Pet a2 = new Cat(5, 4, "Liisu");
      Pet[] shelter = {new Dog(11, 2, "Rex"), new Cat(3, 7, "Ruudi"), new Cat(6, 2, "Aadu")};
      System.out.println(a1.Sound());
      System.out.println(a1.Hello());
      System.out.println(a1.Age());
      System.out.println("****************");
      System.out.println(a2.Sound());
      System.out.println(a2.Hello());
      System.out.println(a2.Age());
      System.out.println("****************");
      System.out.println("Varjupaigas on " + shelter.length + " looma!");
    }
  }

/* 
Woof
Mina olen koer Matu ja minu sabapikkus on 7.0 cm!
Ma olen 5 aastane!
****************
Meow
Mina olen kass Liisu ja minu sabapikkus on 5.0 cm!
Ma olen 4 aastane!
****************
Varjupaigas on 3 looma!
*/

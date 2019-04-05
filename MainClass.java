public class MainClass{
  public static void main(String[] args){
    Animal a1 = new Tiger(4, 7, 5);
    Animal a2 = new Kangaroo(2, 5, 4);
    Animal[] zoo = {new Tiger(4, 11, 2), new Kangaroo(2, 3, 7), new Kangaroo(2, 6, 0)};
    //eraldi objektidena
    System.out.println("---");
    System.out.println(a1.Hello());
    System.out.println(a1.Age());
    System.out.println(a2.Hello());
    System.out.println(a2.Age());
    System.out.println("---");
    //objektimassiivina
    System.out.println("There are " + ZooFunctions.ZooContains(zoo).size() + " animals at the zoo!");
    System.out.println("---");
    System.out.println("Needed amount of food to feed all of the animals: " + ZooFunctions.FeedAnimals(zoo, 1.5) + " kg."); // 1.5 on portsioni suurus, mis tegelikult anti
    System.out.println("---");
  }
}

/*
---
Hello! I am a Tiger and I have 4 legs!
I am 7 years old!
Hello! I am a Kangaroo and I have 2 legs!
I am 5 years old!
---
Hello! I am a Tiger and I have 4 legs!
I am 11 years old!
Hello! I am a Kangaroo and I have 2 legs!
I am 3 years old!
Hello! I am a Kangaroo and I have 2 legs!
I am 6 years old!
There are 3 animals at the zoo!
---
Needed amount of food to feed all of the animals: 15.345 kg.
---
*/

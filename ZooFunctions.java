import java.util.*;

public class ZooFunctions{
  static double GivenMealSize(Animal a, double givenPortionSize){
    return a.Hunger() * givenPortionSize;
  }
  static double FeedAnimals(Animal[] animals, double givenPortionSize){
    double totalFoodNeeded = 0;
    for(Animal a:animals){
      totalFoodNeeded += GivenMealSize(a, givenPortionSize);
    }
    return totalFoodNeeded;
  }
  static List<Animal> ZooContains(Animal[] animals){
    List<Animal> contains = new ArrayList<Animal>();
    for (Animal a: animals){
      if(a instanceof Tiger){
        Tiger t = (Tiger)a;
        contains.add(t);
        System.out.println(a.Hello());
        System.out.println(a.Age());
      }
      else if(a instanceof Kangaroo){
        Kangaroo k = (Kangaroo)a;
        contains.add(k);
        System.out.println(a.Hello());
        System.out.println(a.Age());
      }
    }
    return contains;
  }
}

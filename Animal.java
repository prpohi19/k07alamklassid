public abstract class Animal{
  int age;
  double wasteSize = 1.24; // wasteSize on toidu koef, mis läheb söömisel raisku
  public Animal(int age){
    this.age = age;
  }
  abstract String Hello();
  abstract double HungerCoef();
  public String Age(){
    return "I am " + age + " years old!";
  }
  public double Hunger(){
    return HungerCoef() * wasteSize;
  }
}

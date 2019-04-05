public class Kangaroo extends Animal{
  String spieces = "Kangaroo";
  int legCount;
  double foodNeeded;
  public Kangaroo(int legCount, int age, double foodNeeded){
    super(age);
    this.legCount = legCount;
    this.foodNeeded = foodNeeded;
  }
  @Override
  public String Hello(){
    return "Hello! I am a " + spieces + " and I have " + legCount + " legs!";
  }
  @Override
  public double HungerCoef(){
    return foodNeeded * 0.75; //0.75 on näljatunde kiirendumiskoef, foodNeeded on vajalik toidukogus, et näljatunne oleks 0
  }
}

public class Tiger extends Animal{
  String spieces = "Tiger";
  int legCount;
  double foodNeeded;
  public Tiger(int legCount, int age, double foodNeeded){
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
    return foodNeeded * 1.5; //1.5 on näljatunde kiirendumiskoef, foodNeeded on vajalik toidukogus kilogrammides, et näljatunne oleks 0
  }
}

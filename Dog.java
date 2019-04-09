public class Dog extends Pet{
  String species = "koer";
  double tailLength;
  String name;
  public Dog(double tailLength, int age, String name){
    super(age);
    this.tailLength = tailLength; this.name = name;
  }
  @Override
  public String Hello(){
    return "Mina olen " + species + " " + name + " ja minu sabapikkus on " + tailLength + " cm!";
  }
}
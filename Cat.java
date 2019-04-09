public class Cat extends Pet{
  String species = "kass";
  double tailLength;
  String name;
  public Cat(double tailLength, int age, String name){
    super(age);
    this.tailLength = tailLength; this.name = name;
  }
  @Override
  public String Hello(){
    return "Mina olen " + species + " " + name + " ja minu sabapikkus on " + tailLength + " cm!";
  }
}
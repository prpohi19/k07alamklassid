public abstract class Teacher{
  static String school = "Tallinna Ülikool";
  String name;
  public Teacher(String name){
    this.name = name;
  }
  abstract String Introduce();
  public String Name(){
    return "Hello, my name is " + name;
  }
}

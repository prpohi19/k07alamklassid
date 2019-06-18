public class Moto extends Vehicle {
  public Moto(int price, int power, String color){
    super(price, power, color);
  }

  @Override
  public void sound(){
    System.out.println("Vroom");
  }

  @Override
  public void information() {
    System.out.println("The motorcycle costs "+price+" and has a power of "+power+ " hp and is "+color);
  }
}

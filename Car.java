public class Car extends Vehicle {
  public Car(int price, int power, String color){
    super(price, power, color);
  }

  @Override
  public void sound(){
    System.out.println("Rumble");
  }

  @Override
  public void information() {
    System.out.println("The car costs "+price+" and has a power of "+power+ " hp and is "+color);
  }
}

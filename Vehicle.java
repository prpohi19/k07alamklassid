public abstract class Vehicle {
    int price;
    int power;
    String color;

    public Vehicle(int price, int power, String color) {
        this.price=price;
        this.power=power;
        this.color=color;
    }

    public void sound(){
      System.out.println("igal loomal on oma häälitsus");
    }

    public void information(){
      System.out.println("looma tutvustus");
    }
}

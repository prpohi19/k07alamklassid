public class Main {
    public static void main(String[] args) {

        Vehicle Car=new Car(3000, 100, "yellow");
        Vehicle Moto=new Moto(1100, 85, "red");

        Car.information();
        Car.sound();

        Moto.information();
        Moto.sound();
    }
}

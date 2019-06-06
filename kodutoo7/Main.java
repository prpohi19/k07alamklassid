public class Main{

    public static void main(String[] args) {
        int dif;
        Cars Camaro = new SportCar("Chevrolet", "Camaro", 250);
        Camaro.MarkModel();
        Camaro.Condition();
        Cars Opel = new EconomyCar("Opel", "Omega", 195);
        Opel.MarkModel();
        Opel.Condition();

        if (Camaro.topSpeed > Opel.topSpeed){
          dif = Camaro.topSpeed - Opel.topSpeed;
          System.out.println("Camaro is " + dif + " km/h faster.");
        }else{
          dif = Opel.topSpeed - Camaro.topSpeed;
          System.out.println("Opel is " + dif + " km/h faster.");
        }
    }

}

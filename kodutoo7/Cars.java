public class Cars {
    String mark;
    String model;
    int topSpeed;

    public Cars(String mark, String model, int topSpeed) {
        this.mark = mark;
        this.model = model;
        this.topSpeed = topSpeed;
    }
    public void Condition(){
        System.out.println("All cars are driveble");
    }
    public void MarkModel(){
        System.out.println("This car is " + mark + " " + model);
    }
}

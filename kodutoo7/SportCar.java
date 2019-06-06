public class SportCar extends Cars {
    public SportCar(String mark, String model, int topSpeed) {
        super(mark, model, topSpeed);
    }

    @Override
    public void MarkModel() {
        super.MarkModel();
    }
    public void Condition(){
        System.out.println(model + " drives really faaaaaaast!!!");
    }
}

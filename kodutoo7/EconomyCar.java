public class EconomyCar extends Cars {
    public EconomyCar(String mark, String model, int topSpeed) {
        super(mark, model, topSpeed);
    }

    @Override
    public void Condition() {
        System.out.println("Gets you from point A to point B.");
    }
}

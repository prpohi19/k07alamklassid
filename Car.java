public class Car extends Vehicle {
	private boolean inShop = false;
	
	public Car(String regnr, String mark, String model){
		super(regnr, mark, model);
	}
	
	public void DriveToShop() {
		inShop = true;
	}
	public void DriveToHome() {
		inShop = false;
	}
	
	@Override
	public double getLuggageCapacity() {
		return 450.0;
	}
}
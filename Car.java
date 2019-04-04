public class Car extends Vehicle {
	private boolean inShop = false;
	
	public Car(String regnr, String mark, String model){
		super(regnr, mark, model);
		System.out.println("Loodi auto: "+this);
	}
	public boolean isInShop() {
		return inShop;
	}
	
	public void DriveToShop() {
		inShop = true;
		System.out.println("Auto sõitis poodi.");
	}
	public void DriveToHome() {
		inShop = false;
		System.out.println("Auto sõitis koju.");
	}
	
	@Override
	public double getLuggageCapacity() {
		return 450.0;
	}
}
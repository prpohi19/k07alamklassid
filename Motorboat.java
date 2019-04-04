public class Motorboat extends Vehicle {
	private boolean inWater = false;
	
	public Motorboat(String regnr, String mark, String model){
		super(regnr, mark, model);
	}
	
	public void pushToWater() {
		inWater = true;
	}
	public void pushToShore() {
		inWater = false;
	}
	
	@Override
	public double getLuggageCapacity() {
		return 200.0;
	}
}
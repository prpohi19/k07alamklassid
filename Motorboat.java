public class Motorboat extends Vehicle {
	private boolean inWater = false;
	
	public Motorboat(String regnr, String mark, String model){
		super(regnr, mark, model);
		System.out.println("Loodi mootorpaat: "+this);
	}
	
	public boolean isInWater() {
		return inWater;
	}
	
	public void pushToWater() {
		inWater = true;
		System.out.println("Paat lükati merre");
	}
	public void pushToShore() {
		inWater = false;
		System.out.println("Paat lükati kaldale");
	}
	
	@Override
	public double getLuggageCapacity() {
		return 200.0;
	}
}
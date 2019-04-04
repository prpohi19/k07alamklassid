public abstract class Vehicle {
	String regnr = "";
	String mark = "";
	String model = "";
	
	public Vehicle(String regnr, String mark, String model){
		this.regnr=regnr;
		this.mark=mark;
		this.model=model;
	}
	
	abstract double getLuggageCapacity();
	
	
}
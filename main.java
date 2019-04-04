public class main{
	public static void main(String[] arg){
		System.out.println("");
		
		Car car = new Car("AAA-111", "BMW", "E39");
		Motorboat boat = new Motorboat("BBB-222", "Kalapaat", "1337");
		
		System.out.println("");
		
		System.out.println("Auto pagasi mahutavus: "+car.getLuggageCapacity());
		System.out.println("Paadi pagasi mahutavus: "+boat.getLuggageCapacity());
		
		System.out.println("");
		
		System.out.println("Auto poes: "+(car.isInShop() ? "Jah" : "Ei"));
		System.out.println("Paat vees: "+(boat.isInWater() ? "Jah" : "Ei"));
		
		System.out.println("");
		
		car.DriveToShop();
		boat.pushToWater();
		
		System.out.println("");
		
		System.out.println("Auto poes: "+(car.isInShop() ? "Jah" : "Ei"));
		System.out.println("Paat vees: "+(boat.isInWater() ? "Jah" : "Ei"));
	}
}
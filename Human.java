public class Human extends Mammal {
	private boolean domesticated = false;

    public Human(String name, String sex, int age, double weight){
        super(name, sex, age, weight);
    }

    public String move(){
        return "I can walk on my 2 legs";
    }
	public String intellect(){
		return "Higher intellectual level";
	}
    public void hobbies(){
		System.out.println("Sports");
	}
	public boolean isDomesticated() {
        return domesticated;
    }
    public String liveIn(){
        return "In houses";
    }
  	
    public void eat(){
        System.out.println("Everything");
    } 
	
}
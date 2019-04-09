public class Dog extends Mammal {
	private boolean domesticated = true;
	
    public Dog(String name, String sex, int age, double weight){
        super(name, sex, age, weight);
    }
    public String move(){
        return "I move on all 4 legs, but can sometimes stand up";
    }
	
	public String intellect(){
		return "Lower intellectual level";
	}
	public void hobbies(){
		System.out.println("Playing");
	}
	
    public boolean isDomesticated() {
        return domesticated;
    }
  	
    public String liveIn(){
        return "In dog houses";
    }
  	
    public void eat(){
        System.out.println("Everything");
    } 
}
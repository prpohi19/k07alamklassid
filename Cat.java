public class Cat extends Mammal {
	private boolean domesticated = true;
	
    public Cat(String name, String sex, int age, double weight){
        super(name, sex, age, weight);
    }
    public String move(){
        return "I run on 4 legs";
    }
  
	public String intellect(){
		return "Lower intellectual level";
	}
	public void hobbies(){
		System.out.println("Sleeping");
	}
    public boolean isDomesticated() {
        return domesticated;
    }
  	
    public String liveIn(){
        return "In cat houses";
    }
  	
    public void eat(){
        System.out.println("Mice");
    } 
}
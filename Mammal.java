public abstract class Mammal {
    private boolean domesticated;
	boolean hasHair = true;
    String breathes = "oxygen";
    String skeletalStructure = "backbone";
    String gender;
	String fullName;
	int fullAge;
	double fullWeight;
    public Mammal(String name, String sex, int age, double weight){
        gender = sex;
		fullName = name;
		fullAge = age;
		fullWeight = weight;
        System.out.println("My name is " + name);
		System.out.println("I am a " + gender);
    }
	public boolean isDomesticated() {
        return domesticated;
    }
    public abstract String move();  
	public abstract String intellect();
	public abstract void hobbies();
    public abstract String liveIn();  

    public void feedYoung(){ 
        String food = "milk";
        if (gender =="female")
            System.out.println("I provide my young with " + food);
        else
            System.out.println("I need assistance to feed my young, because I'm a male mammal");
    }

    public boolean hasMammaryGlands(){
        return true;
    }

    public abstract void eat();
}
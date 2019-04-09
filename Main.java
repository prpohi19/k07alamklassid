public class Main {
	
    public static void main(String [] args){
        Dog myDog = new Dog("Rex", "male", 11, 32.1);
		Cat myCat = new Cat("Murka", "female", 8, 10);
		Human myHuman = new Human("Alex", "male", 25, 70.2);
		
		Mammal[] mammals = new Mammal[3];
		mammals[0] = myDog;
		mammals[1] = myCat;
		mammals[2] = myHuman;
		
		for (Mammal m: mammals){
			System.out.println("---DATA---");
			System.out.println("Nimi: " + m.fullName + " Sugu: " + m.gender + " Vanus: " + m.fullAge + " Kaal: " + m.fullWeight);
			System.out.println("Movement: " + m.move());
			System.out.println("I live: " + m.liveIn()); m.feedYoung(); 
			System.out.println("My level of intellect is: " + m.intellect());
			System.out.println("I am domesticated: " + m.isDomesticated());
		}
    
	}  
	
}

/*My name is Rex
I am a male
My name is Murka
I am a female
My name is Alex
I am a male
---DATA---
Nimi: Rex Sugu: male Vanus: 11 Kaal: 32.1
Movement: I move on all 4 legs, but can sometimes stand up
I live: In dog houses
I need assistance to feed my young, because I'm a male mammal
My level of intellect is: Lower intellectual level
I am domesticated: true
---DATA---
Nimi: Murka Sugu: female Vanus: 8 Kaal: 10.0
Movement: I run on 4 legs
I live: In cat houses
I provide my young with milk
My level of intellect is: Lower intellectual level
I am domesticated: true
---DATA---
Nimi: Alex Sugu: male Vanus: 25 Kaal: 70.2
Movement: I can walk on my 2 legs
I live: In houses
I need assistance to feed my young, because I'm a male mammal
My level of intellect is: Higher intellectual level
I am domesticated: false
*/

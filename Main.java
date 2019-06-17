public class Main {
    public static void main(String[] args) {

        Animal dog=new Dog(7, 25, "Black");
        Animal cat=new Cat(4, 5, "White");

        dog.info();
        dog.sound();
        cat.info();
        cat.sound();
    }
}

/*
OUTPUT
Age: 7. Weight: 25. Color: Black
Woof
Age: 4. Weight: 5. Color: White
Meow
*/

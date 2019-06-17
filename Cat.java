public class Cat extends Animal {
    public Cat(int age, int weight, String color){
        super(age, weight, color);
    }

    @Override
    public void sound(){
        System.out.println("Meow");
    }

    @Override
    public void info() {
        System.out.println("Age: "+age+". Weight: "+weight+". Color: "+color);
    }
} 

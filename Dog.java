public class Dog extends Animal {
    public Dog(int age, int weight, String color){
        super(age, weight, color);
    }

    @Override
    public void sound(){
        System.out.println("Woof");
    }

    @Override
    public void info() {
        System.out.println("Age: "+age+". Weight: "+weight+". Color: "+color);
    }
}

public abstract class Animal {
    int age;
    int weight;
    String color;

    public Animal(int age, int weight, String color) {
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

    public void sound(){
        System.out.println("every animal has a sound");
    }
    public void info(){
        System.out.println("animals info");
    }
}

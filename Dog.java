class Dog {
    private String name;
    protected String description;
    private int weight;
    private int speed;
    public Dog(String name, int weight, int speed){
        this.name=name;
        this.weight=weight;
        this.speed=speed;
    }
    public void bark(){
        System.out.println("BARK WOOF BARK");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }
}

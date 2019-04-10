public abstract class Pet{
    int age;
    public Pet(int age){
      this.age = age;
    }
    abstract String Hello();
    abstract String Sound();
    public String Age(){
      return "Ma olen " + age + " aastane!";
    }
  }
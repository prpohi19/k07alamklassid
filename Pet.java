public abstract class Pet{
    int age;
    public Pet(int age){
      this.age = age;
    }
    abstract String Hello();
    public String Age(){
      return "Ma olen " + age + " aastane!";
    }
  }
public abstract class Tree {

    int age;
    double height;

    public Tree(int age, double height){
        this.age = age;
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public abstract String returnType();
}

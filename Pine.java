public class Pine extends Tree{
    String type = "Mänd";

    public Pine(int age, double height) {
        super(age, height);
    }

    public String returnType(){
        return type;
    }

}

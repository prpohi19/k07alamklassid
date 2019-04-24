public class Oak extends Tree{
    String type = "Tamm";

    public Oak(int age, double height) {
        super(age, height);
    }

    public String returnType(){
        return type;
    }
}

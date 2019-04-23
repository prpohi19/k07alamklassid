import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void findStats(List<Tree> trees){
        double highest = 0;
        int hAge = 0;
        String hType = "";

        int oldest = 0;
        double oHeight = 0;
        String oType = "";

        for(int i =0; i <  trees.size(); i++){
            if(trees.get(i).getHeight() > highest){
                highest = trees.get(i).getHeight();
                hAge = trees.get(i).getAge();
                hType = trees.get(i).returnType();
            }

            if(trees.get(i).getAge() > oldest){
                oldest = trees.get(i).getAge();
                oHeight = trees.get(i).getHeight();
                oType = trees.get(i).returnType();
            }
        }
        System.out.println("Kõige kõrgem puu on "+ hAge+ " aasta vanune " + hType + ", mis on " + highest + " meetri kõrgune.");
        System.out.println("Kõige vanem puu on "+ oldest+ " aasta vanune " + oType + ", mis on " + oHeight + " meetri kõrgune.");
    }

    public static double avgHeight(List<Tree> trees){
        double avg = 0;
        for(int i =0; i <  trees.size(); i++){
            avg += trees.get(i).getHeight();
        }
        avg = avg/trees.size();
        return avg;
    }

    public static double avgAge(List<Tree> trees){
        double avg = 0;
        for(int i =0; i <  trees.size(); i++){
            avg += trees.get(i).getAge();
        }
        avg = avg/trees.size();
        return avg;
    }

    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();

        Tree tree1 = new Pine(23, 22.5);
        Tree tree2 = new Pine(56,25.2);
        Tree tree3 = new Oak(102,16.4);
        Tree tree4 = new Oak(36, 14);
        Tree tree5 = new Maple(27, 21);

        trees.add(tree1);
        trees.add(tree2);
        trees.add(tree3);
        trees.add(tree4);
        trees.add(tree5);

        for(int i =0; i <  trees.size(); i++){
            System.out.println("Puu: " + trees.get(i).returnType() + ". Kõrgus: " + trees.get(i).getHeight() + ". Vanus: " + trees.get(i).getHeight() + ".");
        }
        System.out.println("----------------------------------------------");
        findStats(trees);
        System.out.println("Keskmine puu pikkus on: " + avgHeight(trees));
        System.out.println("Keskmine puu vanus on: " + avgAge(trees));
    }
}

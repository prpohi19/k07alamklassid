import java.util.*;
public class Program {
    public static void main(String[] args){
        Dalmatian Piibe = new Dalmatian("Piibe",40,45);
        Dalmatian Mai = new Dalmatian("Mai",42,41);
        Dachshund Muumi = new Dachshund("Muumi",6,12);
        Dachshund Lulu = new Dachshund("Lulu",5,11);
        Shiba Kaito = new Shiba("Kaito",25,30);
        Shiba Toto = new Shiba("Toto",27,31);
        List<Dog> doggos = new ArrayList<Dog>();
        doggos.add(Piibe);
        doggos.add(Mai);
        doggos.add(Muumi);
        doggos.add(Lulu);
        doggos.add(Kaito);
        doggos.add(Toto);


        System.out.println(doggos.get(3).getName());
        System.out.println(doggos.get(3).getDescription());
        System.out.println(doggos.get(3).getWeight());

    }
}

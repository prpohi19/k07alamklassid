package tund7_3;

public class Fighter extends Character {

    String name;
    FighterTypes fighterType;

    public Fighter(String name, FighterTypes characterClassType){
        super(40);
        this.fighterType = characterClassType;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fighterSetQuickness(int quickness){
        super.setQuickness(quickness);
    }

    public int fighterGetQuickness(){
        return super.getQuickness();
    }

    public String toString() {
        return fighterType + " " + this.name + " " + super.toString();
    }
}

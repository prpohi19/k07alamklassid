package tund7_3;

public class Character {
    private int strength = 40;
    private int constitution = 40;
    private int dexterity = 40;
    private int quickness = 40;

    protected Character (int strength){
        this.strength += strength;
    }

    public int getQuickness() {
        return quickness;
    }

    protected void setQuickness(int quickness){
        this.quickness += quickness;
    }

    public String toString() {
        return this.strength + " " + this.constitution + " " + this.dexterity + " " + this.quickness;
    }
}

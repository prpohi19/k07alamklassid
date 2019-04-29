public class Warrior extends Human {
    public Warrior(String name) {
        super(name);
    }
    @Override
    public void attack(Human opponent) {
        System.out.println( getName() +" lööb tegelast " + opponent.getName() + " mõõgaga. || " +opponent.getName()+" kaotab "+ getAttackPower() +" elupunkti.");
        super.attack(opponent);
    }
}

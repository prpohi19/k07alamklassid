public class Wizard extends Human {
    public Wizard(String name) {
        super(name);
    }
    @Override
    public void attack(Human opponent) {
        System.out.println( getName() +" tabab tegelast " + opponent.getName() + " loitsuga. || " +opponent.getName()+" kaotab "+ getAttackPower() +" elupunkti.");
        super.attack(opponent);
    }
}

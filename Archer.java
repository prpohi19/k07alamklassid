public class Archer extends Human {
    private int numArrows = 0;
    public Archer(String name) {
        super(name);
        findArrows();
    }
    public Archer(String name, int startingArrows) {
        super(name);
        numArrows = startingArrows;
    }
    private void findArrows() {
        System.out.println(getName()+" otsib nooli, et võidelda.");
    }
    @Override
    public void attack(Human opponent) {
        System.out.println( getName() +" laseb tegelast " + opponent.getName() + " nooltega. || " +opponent.getName()+" kaotab "+getAttackPower() +" elupunkti.");
        super.attack(opponent);


    }
}

import java.util.Random;

/**
 * Monster
 */
public class Monster extends Character {

    public static final int MAX_DAMAGE = 10;
    public static final int MIN_DAMAGE = 5;

    private Character target;
    private char name;

    public Monster(char name, Character target, int spawnX, int spawnY, Random random) {
        super(spawnX, spawnY);
        this.name = name;
        this.target = target;
        damage = MIN_DAMAGE + random.nextInt(MAX_DAMAGE - MIN_DAMAGE);
        moveSpeed = 1;
    }

    @Override
    public char render() {
        if (isAlive()) {
            return name;
        } else {
            return 'X';
        }
    }

    private void damageTarget() {
        target.hit(damage);
        System.out.println("Monster " + name + " attacked you for " + damage + " damage.");
    }

    @Override
    public void update() {
        if (!isAlive()) {
            return;
        }
        int deltaX = getX() - target.getX();
        int deltaY = getY() - target.getY();

        if (Math.abs(deltaX) < 2 && Math.abs(deltaY) < 2) {
            damageTarget();
            return;
        }

        if (Math.abs(deltaX) > Math.abs(deltaY)) {
            if (deltaX < 0) {
                move(Direction.DIRECTION_RIGHT);
            } else {
                move(Direction.DIRECTION_LEFT);
            }
        } else {
            if (deltaY < 0) {
                move(Direction.DIRECTION_DOWN);
            } else {
                move(Direction.DIRECTION_UP);
            }
        }
        super.update();
    }

    
    @Override
    public String toString() {
        return super.toString() + " is(monster " + name +")";
    }
}
/**
 * Character
 */
abstract public class Character extends Entity {

    protected int moveSpeed;
    protected int damage;

    private int health = 100;
    private boolean alive = true;
    private Direction nextMove = null;

    public Character(int spawnX, int spawnY) {
        super(spawnX, spawnY);
        moveSpeed = 2;
    }

    @Override
    public void update() {
        if (nextMove != null) {
            switch (nextMove) {
                case DIRECTION_UP:
                    setY(getY() - moveSpeed);
                    break;
                case DIRECTION_DOWN:
                    setY(getY() + moveSpeed);
                    break;
                case DIRECTION_RIGHT:
                    setX(getX() + moveSpeed);
                    break;
                case DIRECTION_LEFT:
                    setX(getX() - moveSpeed);
                    break;
                default:
                    break;
            }
            nextMove = null;
        }
    }

    public void hit(int hitDamage) {
        if (!alive) {
            return;
        }
        health -= hitDamage;
        if (health <= 0) {
            health = 0;
            alive = false;
        }
    }

    public void move(Direction direction) {
        nextMove = direction;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return super.toString() + (isAlive() ? " health(" + health + ")" : " *DEAD*");
    }
}
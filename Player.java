import java.util.ArrayList;
import java.util.List;

/**
 * Player
 */
public class Player extends Character {

    private int walkSpeed;
    private int runSpeed;

    public Player(int spawnX, int spawnY) {
        super(spawnX, spawnY);
        damage = 50;
        walkSpeed = 1;
        runSpeed = 2;
    }

    public List<Projectile> attack(Game game, Direction direction) {
        List<Projectile> projectiles = new ArrayList<>();

        switch (direction) {
        case DIRECTION_UP:
            for (int y = getY() - 1; y >= 0; y--) {
                projectiles.add(new Projectile(game, damage, true, getX(), y));
            }
            break;
        case DIRECTION_DOWN:
            for (int y = getY() + 1; y < MAX_Y; y++) {
                projectiles.add(new Projectile(game, damage, true, getX(), y));
            }
            break;
        case DIRECTION_RIGHT:
            for (int x = getX() + 1; x < MAX_X; x++) {
                projectiles.add(new Projectile(game, damage, false, x, getY()));
            }
            break;
        case DIRECTION_LEFT:
            for (int x = getX() - 1; x >= 0; x--) {
                projectiles.add(new Projectile(game, damage, false, x, getY()));
            }
            break;
        default:
            break;
        }

        return projectiles;
    }

    @Override
    public char render() {
        return 'O';
    };

    @Override
    public String toString() {
        return super.toString() + " is(Player)";
    }

    @Override
    public void move(Direction direction) {
        moveSpeed = runSpeed;
        super.move(direction);
    }

    public void move(Direction direction, boolean walk) {
        if (walk) {
            moveSpeed = walkSpeed;
            super.move(direction);
        } else {
            move(direction);
        }
        
    }
}
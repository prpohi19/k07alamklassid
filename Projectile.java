
/**
 * Projectile
 */
public class Projectile extends Entity {
    private int damage;
    private boolean vertical;
    private Game game;

    public Projectile(Game game, int damage, boolean vertical, int spawnX, int spawnY) {
        super(spawnX, spawnY);
        this.damage = damage;
        this.vertical = vertical;
        this.game = game;
    }

    @Override
    public char render() {
        if (vertical) {
            return '│';
        } else {
            return '─';
        }
    }

    @Override
    public void update() {
        for (Entity entity : game.getEntitiesList()) {
            if (entity instanceof Monster) {
                if (entity.getX() == getX() && entity.getY() == getY()) {
                    ((Monster) entity).hit(damage);
                }
            }
        }
        remove();
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return super.toString() + " is(Projectile)";
    }
    
    
}
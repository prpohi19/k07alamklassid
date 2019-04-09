/**
 * Entity
 */
abstract public class Entity {

    public static final int MAX_X = 40;
    public static final int MAX_Y = 20;

    private int x = 0;
    private int y = 0;
    private boolean visible = true;
    private boolean markedRemoved = false;

    public Entity(int spawnX, int spawnY) {
        x = spawnX;
        y = spawnY;
    }

    abstract public char render();

    abstract public void update();

    protected int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void remove() {
        markedRemoved = true;
    }

    public boolean isMarkedRemoved() {
        return markedRemoved;
    }

    @Override
    public String toString() {
        return "Entity: at(" + x + " " + y + ")";
    }
}
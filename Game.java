import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }

    Player player;
    List<Entity> entities = new ArrayList<>();
    Random rng;
    Scanner reader;
    int monstersCount;
    
    public Game() {
        reader = new Scanner(System.in);
        rng = new Random();
    }

    public void startGame() {

        player = new Player(rng.nextInt(Entity.MAX_X), rng.nextInt(Entity.MAX_Y));
        entities.add(player);

        // List<Monster> monsters = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            entities.add(new Monster(Integer.toString(i).charAt(0), player, rng.nextInt(Entity.MAX_X), rng.nextInt(Entity.MAX_Y), rng));
        }
        System.out.println("You are 'O'");
        loop();
    }

    public List<Entity> getEntitiesList() {
        return entities;
    }

    private void loop() {
        while (true) {
            System.out.println("\n\n*********************************************************************");
            update();
            render();
            if (!player.isAlive()) {
                System.out.println("You died! Game over.");
                return;
            } else if (monstersCount == 0) {
                System.out.println("All monsters are dead. You win!");
                return;
            }
            input();
        }
    }

    
    private void input() {
        char input;
        while (true) {
            System.out.println("What is your action? [W - walk, R - run, S - Shoot]: ");
            input = reader.next().charAt(0);
            if (input == 'W' || input == 'w') {
                player.move(askDirection("What direction?"), true);
                break;
            } else if (input == 'R' || input == 'r') {
                player.move(askDirection("What direction?"));
                break;
            } else if (input == 'S' || input == 's') {
                entities.addAll(player.attack(this, askDirection("What direction?")));
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    private void update() {
        ListIterator<Entity> iter = entities.listIterator();
        monstersCount = 0;
        while(iter.hasNext()){
            Entity entity = iter.next();
            if (entity.isMarkedRemoved()) {
                iter.remove();
                continue;
            }
            entity.update();
            if (entity instanceof Monster) {
                if (((Monster) entity).isAlive()) {
                    monstersCount++;
                }
            }
        }
    }

    private void render() {
        StringBuilder gameField = new StringBuilder();
        
        // Top border
        gameField.append("╔");
        for (int i = 0; i < Entity.MAX_X; i++) {
            gameField.append("═");
        }
        gameField.append("╗ Entity list: \n");

        for (int y = 0; y < Entity.MAX_Y; y++) {
            gameField.append("║");
            for (int x = 0; x < Entity.MAX_X; x++) {
                renderEntitiesAt(gameField, x, y);
            }
            gameField.append("║ ");
            if (entities.size() > y) {
                Entity entity = entities.get(y);
                gameField.append(entity.toString());
            }
            gameField.append("\n");
        }

        // Bottom border
        gameField.append("╚");
        for (int i = 0; i < Entity.MAX_X; i++) {
            gameField.append("═");
        }
        gameField.append("╝\n");
        System.out.println(gameField.toString());
    }

    private void renderEntitiesAt(StringBuilder gameField, int x, int y) {
        int location = gameField.length();
        gameField.append(' ');
        for (int i = entities.size() - 1; i >= 0; i--) {
            Entity entity = entities.get(i);
            if (entity.getX() == x && entity.getY() == y && entity.isVisible()) {
                gameField.setCharAt(location, entity.render());
            }
        }
    }

    private Direction askDirection(String message) {
        char input;
        while (true) {
            System.out.println(message + " [W - up, A - left, S - down, D - right]");
            input = reader.next().charAt(0);
            switch (input) {
                case 'W':
                case 'w':
                    return Direction.DIRECTION_UP;
                case 'A':
                case 'a':
                    return Direction.DIRECTION_LEFT;
                case 'S':
                case 's':
                    return Direction.DIRECTION_DOWN;
                case 'D':
                case 'd':
                    return Direction.DIRECTION_RIGHT;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}
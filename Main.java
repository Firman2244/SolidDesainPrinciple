class GameCharacter {
    String name;
    int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " is attacking!");
    }

    public void saveToFile() {
        System.out.println("Saving character to file...");
    }

    public void render() {
        System.out.println("Rendering character on screen...");
    }
}

public class Main {
    public static void main(String[] args) {
        GameCharacter c = new GameCharacter("Knight", 100);
        c.attack();
        c.saveToFile();
        c.render();
    }
}
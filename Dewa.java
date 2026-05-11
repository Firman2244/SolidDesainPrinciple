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
}

class CharacterRepository {
    public void save(GameCharacter character) {
        System.out.println("Saving " + character.name + " to file...");
    }
}

class CharacterRenderer {
    public void render(GameCharacter character) {
        System.out.println("Rendering " + character.name + " on screen...");
    }
}

public class Dewa {
    public static void main(String[] args) {
        GameCharacter c = new GameCharacter("Knight", 100);

        CharacterRepository repo = new CharacterRepository();
        CharacterRenderer renderer = new CharacterRenderer();

        c.attack();
        repo.save(c);
        renderer.render(c);
    }
}
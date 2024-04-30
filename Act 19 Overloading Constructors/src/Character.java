public class Character {
    private String name;
    private int hp;
    private int atk;
    private int def;

    // Constructor with no parameters -- default
    public Character() {
    }
    //Constructor with only name for parameter -- variable and variable set with setters
    public Character(String creatureName) {
        this.name = creatureName;
    }

    //constructor with 3 parameters
    public Character(String creatureName, int creatureHP, int creatureATK, int creatureDEF) {
        this.name = creatureName;
        this.hp = creatureHP;
        this.atk = creatureATK;
        this.def = creatureDEF;
    }
    public int getHP() {
        return hp;
    }

    public void setHP(int newHP, int def) {
        if (def > 10) {
            hp = newHP + 5;
        }
    }
    public void setHP(int newHP) {
        if (def > 10) {
            hp = newHP + 5;
        }
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
}
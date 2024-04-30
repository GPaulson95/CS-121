public class Main {
    public static void main(String[] args){

        Character character1 = new Character();
        Character character2 = new Character("Barbar");
        Character character3 = new Character("Calcab",2500,1800,1300);

    System.out.printf("Original health: %d\n", character3.getHP());
    character3.setHP(10);
    System.out.printf("Set health %d\n", character3.getHP());
    character3.setHP(10, character3.getDef());
    System.out.printf("Set health with strength %d\n", character3.getHP());

    }
}
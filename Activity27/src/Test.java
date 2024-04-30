public class Test {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();

        ds.addHomeStateQueu("Indiana");
        ds.addHomeStateQueue("California");
        ds.addHomeStateQueue("Florida");

        ds.printHomeStateQueue();

        ds.removeHomeStateQueue();

        ds.printHomeStateQueue();
    }
}

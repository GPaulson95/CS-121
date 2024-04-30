import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8));
        ArrayList<Character> characterArrayList = new ArrayList(Arrays.asList('A','B','C','D','G','H'));
        ArrayList<String> stringArrayList = new ArrayList(Arrays.asList("Alpha","Beta","Gamma","Delta","Epsilon"));
       // ArrayList<>
        //create an instance of print array class
        GenericArrayList printList = new GenericArrayList();

        //Accessing the method
        printList.printIntegerArrayList(integerArrayList);
        printList.printDoubleArrayList(doubleArrayList);
        printList.printCharacterArrayList(characterArrayList);
        printList.printStringArrayList(stringArrayList);
        //printList.printArrayList();

    }
}
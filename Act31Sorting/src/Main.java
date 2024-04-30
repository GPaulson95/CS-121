import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Sorting sorting = new Sorting();
        ArrayList <Integer> unsortedArray = sorting.getArray();
        System.out.println("Unsorted Array"+unsortedArray);
        System.out.println("Sorted Array"+sorting.sortArray(unsortedArray));

    }
}
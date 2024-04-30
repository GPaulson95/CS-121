import java.util.ArrayList;
public class GenericArrayList {
    public void printIntegerArrayList(ArrayList<Integer> integerArrayList){
        System.out.println("\nPrinting out Integers");
        for (int num : integerArrayList){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void printDoubleArrayList(ArrayList<Double> doubleArrayList){
        System.out.println("\nPrinting out doubles");
        for (double num : doubleArrayList){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void printCharacterArrayList(ArrayList<Character> characterArrayList){
        System.out.println("\nPrinting out characters");
        for (char num : characterArrayList){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void printStringArrayList(ArrayList<String> stringArrayList){
        System.out.println("\nPrinting out string");
        for (String num : stringArrayList){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    //public <E> void printArrayList(ArrayList<E> multiArrayList){
      //  System.out.println("\nPrinting out multiple types of array lists");
     //   for (E num : multipleArrayList){
     //       System.out.print(num + " ");
     //   }
     //   System.out.println();
}

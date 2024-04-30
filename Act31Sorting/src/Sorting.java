import java.util.ArrayList;
import java.util.Scanner;
public class Sorting {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Integer> getArray(){
        ArrayList<Integer> unsortedArray = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Integer " + i + ": ");
            unsortedArray.add(scanner.nextInt());
        }
        return unsortedArray;

    }
    public ArrayList<Integer> sortArray(ArrayList<Integer>sortedArray){
        int temp;
        for (int i = 0; i < sortedArray.size() - 1; i++){
            for (int j = 0; j < sortedArray.size() - i- 1; j++){
                if (sortedArray.get(j) > sortedArray.get(j + 1)){
                    temp = sortedArray.get(j);
                    sortedArray.set(j,j+1);
                    sortedArray.set(j+1,temp);
                }
            }
        }
    return sortedArray;
    }
}

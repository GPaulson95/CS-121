import java.util.ArrayList;

public class ArrayListTester {
    public static void main(String[] args){
        StringArrayList starList1 = new StringArrayList();
        starList1.addString("Altair");
        starList1.addString("Deneb");
        starList1.addString("Mirzam");
        starList1.addString("Sargas");

        starList1.removeString(2);
        System.out.println(starList1.getSize());

        System.out.println(starList1.getElement(2));
        starList1.display();
        starList1.displayOther();






    }
}

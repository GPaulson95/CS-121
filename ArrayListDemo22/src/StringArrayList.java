import java.util.ArrayList;
public class StringArrayList {
    public ArrayList<String> starList = new ArrayList<>();

    public void addString(String name){
        starList.add(name);

    }
    public void removeString(int index){
        starList.remove(index);
    }
    public int getSize(){
       return starList.size();
    }
    public String getElement(int index){
        return starList.get(index);
    }
    public void display() {
        for (int i = 0; i < starList.size(); i++) {
            System.out.printf("Array Elements: %s\n", starList.get(i));
        }
    }
    public void displayOther(){
        for (String i : starList){
            System.out.printf("Array Elements: %s\n", i);
        }
    }
}
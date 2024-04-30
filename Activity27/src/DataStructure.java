import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>(); // student names//
    private int[] ageList = new int[3]; //student ages//
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    //write an add method to add an element to the data structure

    public void addHomeStateQueue(String state){
        homeStateQueue.add(state);
    }
    public void addHometownStack(String hometown){
        hometownStack.push(hometown);
    }
    public void addNationalityList(String nationality){
        nationalityList.add(nationality);
    }
    public void addAgeList(int age){

    }
    public void addStudentList(String student){
        studentList.add(student);
    }
    //write a remove method to remove an element from the data structure
    public void removeHomeStateQueue() {
        homeStateQueue.remove();
    }
    public void removeHometownStack(){
        hometownStack.pop();
    }
    public void removeNationalityList(String nationality){
        nationalityList.remove();
    }
    public void removeAgeList(){

    }
    public void removeStudentList(String student){
        studentList.remove(student);
    }
    //print
    public void printHomeStateQueue(){
        System.out.println("----- Queue -----");
        for(String state: homeStateQueue){
            System.out.println("State Name: "+ state);
        }
    }
    public void printHometownStack(){
        System.out.println("---Hometown Stack---");
        for(String hometown: hometownStack){
            System.out.println("Hometown Name: "+hometown);
        }
    }
    public void printNationalityList(){
        System.out.println("---Nationality List---");
        for (String nationality: nationalityList){
            System.out.println("Nationality: "+nationality);
        }
    }
    public void printStudentList(){
        for (String studentName: studentList){
            System.out.println("Student Name: "+studentList);
        }
    }
}

package weekSeven.packageDemo;

public class Students {
    String name;
    int age;
    private String location;
    private String school;

    //constructor
    public Students(String name, int age, String location, String school) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.school = school;
    }

    //method #1
    public void printStudents() {
        System.out.println(name + age + location + school);
    }
    private void printName(){
        System.out.println(age);
    }
    public int printAge(int age){
        return age * 2;
    }
    public void printAge(){
        System.out.println(age);
    }
}
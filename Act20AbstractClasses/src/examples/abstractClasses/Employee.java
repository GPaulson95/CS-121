package examples.abstractClasses;

public abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\n", name,id);
    }
    public abstract double calculatePay();
}

package examples.abstractClasses;

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(int id, String name, double salary){
        super(id,name);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\nSalary: %.2f\n",name,id,salary);
    }
    @Override
    public double calculatePay(){
        return salary/52;
    }
}

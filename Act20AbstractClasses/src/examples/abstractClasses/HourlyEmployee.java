package examples.abstractClasses;

public class HourlyEmployee extends Employee{
    private double wage;
    private int hours;

    public HourlyEmployee(int id, String name, double wage, int hours){
        super(id,name);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage(){
        return wage;
    }
    public void setWage(double wage){
        this.wage = wage;
    }
    public int getHours(){
        return hours;
    }
    public void setHours(){
        this.hours = hours;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\nWage: %.2f\nHours: ",name,id,wage,hours);
    }
    @Override
    public double calculatePay(){
        return wage * hours;
    }
}

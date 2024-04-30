package examples.abstractClasses;

public class EmployeeTest {
    public static void main(String[] args){
        SalariedEmployee employee1 = new SalariedEmployee(12345,"John Doe",80000);
        System.out.printf("weekly Salary: %.2f%n",employee1.calculatePay());
        HourlyEmployee employee2 = new HourlyEmployee(23456, "Jane Doe", 29, 40);
        System.out.printf("Weekly Salary: %.2f%n", employee2.calculatePay());
    }
}

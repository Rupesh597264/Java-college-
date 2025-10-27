abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;
    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
public class abs2 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Akash", 101, 30000);
        Employee emp2 = new PartTimeEmployee("Rohan", 102, 40, 500);
        System.out.println(emp1.name + "'s Salary: " + emp1.calculateSalary());
        System.out.println(emp2.name + "'s Salary: " + emp2.calculateSalary());
    }
}
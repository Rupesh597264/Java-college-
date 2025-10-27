class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id); 
        this.department = department;
    }
    void displayDetails() {
        super.displayDetails(); 
        System.out.println("Department: " + department);
    }
}
public class abs5 {
    public static void main(String[] args) {
        Manager m = new Manager("Rakesh", 101, "HR");
        m.displayDetails();
    }
}
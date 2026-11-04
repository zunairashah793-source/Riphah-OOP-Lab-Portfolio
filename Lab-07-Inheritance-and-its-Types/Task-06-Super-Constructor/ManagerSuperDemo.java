class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
        System.out.println("Employee created: " + name);
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name); // Parent constructor must be called first.
        System.out.println("Manager bonus: eligible.");
    }
}

public class ManagerSuperDemo {
    public static void main(String[] args) {
        new Manager("Ayesha Khan");
    }
}

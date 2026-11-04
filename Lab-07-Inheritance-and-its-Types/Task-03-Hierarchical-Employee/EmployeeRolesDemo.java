class Employee {
    protected String name;

    public Employee(String name) { this.name = name; }

    public void showName() { System.out.println("Employee name: " + name); }
}

class Manager extends Employee {
    public Manager(String name) { super(name); }
    public void showRole() { System.out.println(name + " is a Manager."); }
}

class Engineer extends Employee {
    public Engineer(String name) { super(name); }
    public void showRole() { System.out.println(name + " is an Engineer."); }
}

public class EmployeeRolesDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Ayesha");
        Engineer engineer = new Engineer("Bilal");
        manager.showName(); manager.showRole();
        engineer.showName(); engineer.showRole();
    }
}

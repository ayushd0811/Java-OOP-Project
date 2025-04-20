

//basic program demonstrating OOP concepts such as Class, Object, Method Overriding, Encapsulation, and Inheritance.
class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {                 //Getter method
        return name;
    }

    public int getId() {
        return id;
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class Developer extends Employee {
    private String language;
    public Developer(String name, int id, String language) {
        super(name, id);
        this.language = language;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + language);
    }
}


public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Ayush", 101, "Java");
        dev1.displayInfo();
    }
}


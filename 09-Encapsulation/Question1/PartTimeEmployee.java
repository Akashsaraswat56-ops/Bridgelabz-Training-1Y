package Question1;
public class PartTimeEmployee extends Employee implements Department {
    // New fields specific to Part-Time
    private int hoursWorked;
    private double hourlyRate;
    private String departmentName;

    // Constructor: Passes id, name, and 0 to the parent's baseSalary
    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0); // Base salary is 0 because we calculate by hours
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Implementing the abstract method from Employee
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Implementing Department methods
    @Override
    public void assignDepartment(String deptName) {
        this.departmentName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName + " (Part-Time Status)";
    }

    // Concrete method for this subclass (Optional: Override displayDetails)
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls the ID and Name from Employee
        System.out.println("Type       : Part-Time");
        System.out.println("Total Pay  : " + calculateSalary());
    }
}
package Question1;
abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId =employeeId;
        this.name =name;
        this.baseSalary =baseSalary;
    }
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Error: Salary cannot be negative. Setting to 0.");
            this.baseSalary = 0;
        }
    }

    public void displayDetails() {
        System.out.println("------------------------------");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name       : " + name);
    }

    public abstract double calculateSalary();
}

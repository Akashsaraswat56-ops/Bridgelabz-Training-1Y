package Question1;

public class EmployeeSystem {
    public static void main(String[] args) {
        // 1. Create a fixed-size array of Employee references
        Employee[] staff = new Employee[2];

        // 2. Create the objects and store them in the array slots
        FullTimeEmployee ft = new FullTimeEmployee(101, "Amrit", 50000.0);
        ft.assignDepartment("Software Engineering");

        PartTimeEmployee pt = new PartTimeEmployee(102, "Harish", 40, 25.0);
        pt.assignDepartment("Technical Support");

        // Assigning to specific indexes [0, 1, 2...]
        staff[0] = ft;
        staff[1] = pt;

        // 3. Process the array using a standard for-loop
        System.out.println("=== Employee Management System (Array Version) ===");

        for (int i = 0; i < staff.length; i++) {
            Employee emp = staff[i]; // Get the employee at current index

            if (emp != null) { // Good practice: check if the slot isn't empty
                emp.displayDetails();
                System.out.println("Calculated Salary: ₹" + emp.calculateSalary());

                // Polymorphism check for Interface
                if (emp instanceof Department) {
                    System.out.println(((Department) emp).getDepartmentDetails());
                }
            }
        }
    }
}
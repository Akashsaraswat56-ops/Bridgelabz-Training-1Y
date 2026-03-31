package Question1;
public class FullTimeEmployee extends Employee implements Department{
    private String departName;

    public FullTimeEmployee(int id,String name,double Salary){
        super(id,name,Salary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }


    @Override
    public void assignDepartment(String deptName) {
     this.departName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department Name -> "+departName;
    }
}

package openclosed;

//every employee might also get projectAllocated to them. We need to store project name if applicable


public class Employee implements EmployeeInterface {
    private String employeeId;
    private float employeeSalary;


    public Employee(String employeeId, float employeeSalary) {
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public float getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void attendanceCheck(){

    }

    public void checkSalary(){
        
    }


    @Override
    public String toString() {
        return "{" +
            " employeeId='" + getEmployeeId() + "'" +
            ", employeeSalary='" + getEmployeeSalary() + "'" +
            "}";
    }

}

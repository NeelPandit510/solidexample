package openclosed;

public class ProjectAllocatedEmployee extends Employee {
    
    private String employeeProjectName;


    public ProjectAllocatedEmployee(String employeeId, float employeeSalary,String employeeProjectName) {
        super(employeeId, employeeSalary);
        this.employeeProjectName = employeeProjectName;
    }

    void sendProjectReport(){
        ///logic for sending report!
    }


}

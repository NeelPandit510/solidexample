// package solidprinciple;
import openclosed.Employee;
import openclosed.ProjectAllocatedEmployee;

public class Main {

    public static void main(String[] args) {
        ProjectAllocatedEmployee p1  = new ProjectAllocatedEmployee("101", 45000.00f, "Automation");
        Employee e2 = new Employee("102", 50000.00f);
        Employee e3 = new Employee("103", 55000.00f);
 
        Employee[] arr = new Employee[]{p1,e2,e3};

    }
}

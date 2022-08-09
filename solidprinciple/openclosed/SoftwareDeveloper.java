package openclosed;

public class SoftwareDeveloper extends Employee{
  private String techStack;

  public SoftwareDeveloper(String techStack, String employeeId, float employeeSalary) {
    super(employeeId, employeeSalary);
    this.techStack = techStack;
  }

  public String getTechStack() {
    return this.techStack;
  }

  public void setTechStack(String techStack) {
    this.techStack = techStack;
  }

  @Override
  public String toString() {
    return "{" +
      " techStack='" + getTechStack() + "'" +
      "}";
  }


}

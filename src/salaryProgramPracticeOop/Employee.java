package salaryProgramPracticeOop;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private EmployeesList list = new EmployeesList();

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double calculateSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void addToList() {
        Employee[] listEmployee = list.getList();
        for (int i = 0; i < listEmployee.length; i++) {
            System.out.println(listEmployee[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary + '}';
    }

    public void setEmployeesList(Employee employee) {
        Employee[] listEmployee = list.getList();
        for (int i = 0; i < listEmployee.length; i++) {
            if (listEmployee[i] == null) {
                listEmployee[i] = employee;
                break;
            }
        }
    }


}

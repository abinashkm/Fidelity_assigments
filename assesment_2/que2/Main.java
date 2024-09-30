package que2;

public class Main {
    public static void main(String[] args) {
    EmployeeManager employeeManager = new EmployeeManager();

    Employee employee1 = new Employee("John Doe", 1);
    Employee employee2 = new Employee("Jane Doe", 2);

    employeeManager.addEmployee(employee1);
    employeeManager.addEmployee(employee2);

    try {
        Employee employee = employeeManager.getEmployee(1);
        System.out.println("Employee found: " + employee.getName());
    } catch (EmployeeNotFoundException e) {
        System.out.println(e.getMessage());
        
    }

    try {
        Employee employee = employeeManager.getEmployee(3);
        System.out.println("Employee found: " + employee.getName());
    } catch (EmployeeNotFoundException e) {
        System.out.println(e.getMessage());
    }
}
}
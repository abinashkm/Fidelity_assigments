//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Employee name: ");
        String name = sc.nextLine();

        System.out.println("Enter the Daily wages: ");
        int dailyWages = sc.nextInt();

        System.out.println("Enter Days of work: ");
        int noOfDay = sc.nextInt();

        TemproraryEmployee temproraryEmployee = new TemproraryEmployee(id, name, dailyWages, noOfDay);
        temproraryEmployee.calculateSalary();
        temproraryEmployee.calculateBonus();

        System.out.println("Employee id: " + temproraryEmployee.getId());
        System.out.println("Employee name: " + temproraryEmployee.getName());
        System.out.println("Employee daily wages: " + temproraryEmployee.getDailyWages());
        System.out.println("No of Days worked: "+ temproraryEmployee.getNoOfDay());
        System.out.println("bonus: "+ temproraryEmployee.getBonus());
        System.out.println("Net salary: "+ temproraryEmployee.getNetSalary());

        sc.close();
    }
}
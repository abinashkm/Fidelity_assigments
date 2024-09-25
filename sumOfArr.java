import java.util.Scanner;
public class sumOfArr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

          
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

    
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { 
                sum += num; 
            }
        }

        
        System.out.println("The sum of even numbers is: " + sum);

        
        scanner.close();


    }


}

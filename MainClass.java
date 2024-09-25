/**
 * MainClass
 */

import java.util.Scanner;

public class MainClass {

    // Function to calculate average
public static double calculateavg(double[] numbers) {
    double sum = 0;

    // Loop through the array and calculate the sum of the numbers
    for (double num : numbers) {
        sum += num;
    }

    // Return the average
    return sum / numbers.length;
}

// Main function to take user input and call calculateavg
public static void main(String[] args) {
    // Create Scanner object to read input from user
    Scanner userInput = new Scanner(System.in);

    // Ask user for the size of the array
    System.out.print("Enter the size of numbers: ");
    int size = userInput.nextInt();

    // Create an array to store the numbers
    double[] numbers = new double[size];

    // Ask the user to input the numbers
    System.out.println("Enter your numbers: ");
    for (int i = 0; i < size; i++) {
        numbers[i] = userInput.nextDouble();
    }

    // Call calculateavg to get the average
    double avg = calculateavg(numbers);

    // Print the result
    System.out.println("Your average is: " + avg);
}
}
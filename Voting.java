
import java.util.Scanner;

public class Voting {

   
    public static String checkVotingEligibility(int age) {
        if (age >= 18) {
            return "You are eligible to vote!";
        } else {
            return "Sorry, you must be at least 18 years old to vote.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        System.out.println(checkVotingEligibility(age));

        scanner.close();
    }
}

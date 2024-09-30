import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insurance Number: ");
        String insuranceNo = scanner.next();

        System.out.print("Insurance Name: ");
        String insuranceName = scanner.next();

        System.out.print("Amount Covered: ");
        double amountCovered = scanner.nextDouble();

        System.out.print("Select 1. Life Insurance 2. Motor Insurance: ");
        int option = scanner.nextInt();

        Insurance insurance = null;

        if (option == 1) {
            System.out.print("Policy Term: ");
            int policyTerm = scanner.nextInt();

            System.out.print("Benefit Percent: ");
            float benefitPercent = scanner.nextFloat();

            insurance = new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benefitPercent);
        } else if (option == 2) {
            System.out.print("Depreciation Percent: ");
            float depPercent = scanner.nextFloat();

            insurance = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
        }

        double premium = addPolicy(insurance, option);
        System.out.println("Calculated Premium: " + premium);
    }

    public static double addPolicy(Insurance insurance, int opt) {
        if (opt == 1) {
            LifeInsurance lifeInsurance = (LifeInsurance) insurance;
            return lifeInsurance.calculatePremium();
        } else if (opt == 2) {
            MotorInsurance motorInsurance = (MotorInsurance) insurance;
            return motorInsurance.calculatePremium();
        }
        return 0.0;
    }
}
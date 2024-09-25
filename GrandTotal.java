
import java.util.Scanner;

public class GrandTotal {
    public static void main(String[] args) {
        int pizza = 200;
        int puff = 40;
        int pepsi = 200;

        Scanner input = new Scanner(System.in);

        System.out.print("enter the numbers of pizza: ");
        int numpizza = input.nextInt();

        
        System.out.print("enter the numbers of puff: ");
        int numpuff = input.nextInt();

        
        System.out.print("enter the numbers of pepsi: ");
        int numpepsi = input.nextInt();

        int pizzacost = numpizza*pizza;
        int puffcost = numpuff*puff;
        int pepsicost = numpepsi*pepsi;


        int GrandTotal = pizzacost + pepsicost + puffcost;

        System.err.println("the grand total is : " + GrandTotal);
    }
}

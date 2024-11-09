/*******************************************************************
@Title:	CiftlikciKeremLogicalOperators
@Purpose:	To calculate the pizza order amount. For Lab4
@Author:    Ciftlikci Kerem 
@Date:   	11/10/24 | 10th of November 2024
@Version:	1.0
********************************************************************/
import java.util.Scanner;

public class CiftlikciKeremLogicalOperators {
    
    public static int checknToppings() {
        Scanner scanner = new Scanner(System.in);  

        int nToppings;
        while (true) { 
            System.out.println("Enter how many toppings you want: ");
            nToppings = scanner.nextInt();  

            if (nToppings >= 0) {
                break;
            } else {
                System.out.println("The number of toppings must be more than 0");
            }
        }
        return nToppings;
    }

    public static void comparenToppings(int nToppings) {
        if (0 < nToppings && nToppings < 2) {
            int firstResult = 6 + 2 * nToppings;
            System.out.printf("Order amount is: $%d%n", firstResult);
        } else if (nToppings == 2) {
            int secondResult = 9;
            System.out.printf("Order amount is: $%d%n", secondResult);
        } else {
            int thirdResult = (int) ((6 + 1.5 * nToppings) * 95 / 100);
            System.out.printf("Order amount is: $%d%n", thirdResult);
        }
    }
    
    public static void main(String[] args) {
        int nToppings = checknToppings();
        comparenToppings(nToppings);
    }  
}

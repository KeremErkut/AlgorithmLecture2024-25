/*******************************************************************
@Title:	CiftlikciKeremLogicalOperators
@Purpose:	To calculate the pizza order amount. For Lab4
@Author:    Ciftlikci Kerem 
@Date:   	11/10/24 | 10th of November 2024
@Version:	1.1
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
                System.out.println("The number of toppings must be 0 or more.");
            }
        }
        return nToppings;
    }

    public static void calculateAmount(int nToppings) {
        float pizzaPrice = 6.0f;
        float toppingPrice;
        
        // Calculate topping price based on number of toppings
        if (nToppings == 1) {
            toppingPrice = nToppings * 2.0f;
        } else if (nToppings >= 2) {
            toppingPrice = nToppings * 1.5f;
        } else {
            toppingPrice = 0.0f;
        }

        
        float totalAmount = pizzaPrice + toppingPrice;
        
        
        if (totalAmount > 10) {
            totalAmount *= 0.95f;
        }

        
        System.out.printf("Order amount is: $%.2f%n", totalAmount);
    }

    public static void main(String[] args) {
        int nToppings = checknToppings();
        calculateAmount(nToppings);
    }  
}

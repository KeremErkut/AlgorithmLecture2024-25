/*******************************************************************
@Title:	    CiftlikciKeremOddEven
@Purpose:	To understand basics in java
@Author:    Ciftlikci Kerem 
@Date:   	11/16/24 | 16th of November 2024
@Version:	1.0
********************************************************************/
import java.util.Scanner;

public class CiftlikciKeremOddEven {

    
    public static int checkNumber() {
        Scanner keyboard = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Please enter a positive number:");
            number = keyboard.nextInt();

            if (number >= 0) {
                break;
            } else {
                System.out.println("The number must be positive. Try again.");
            }
        }
        return number;
    }

    
    public static void isOddOrEven(int number) {
        if ((number % 2) == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void main(String[] args) {
        int number = checkNumber(); 
        isOddOrEven(number);        
    }
}

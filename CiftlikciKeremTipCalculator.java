/*******************************************************************
@Title:	CiftlikciKeremTipCalculator
@Purpose:	To calculate the total check, including the tip. For Lab4
@Author:    Ciftlikci Kerem 
@Date:   	11/9/24 | 9th of November 2024
@Version:	1.0
********************************************************************/

import java.util.Scanner;

public class CiftlikciKeremTipCalculator {

    public static int checkTipRate() {
        Scanner scanner = new Scanner(System.in);  

        int tipRate;
        while (true) { 
            System.out.println("Please enter the tip rate (0 to 100): ");
            tipRate = scanner.nextInt();  

            if (tipRate >= 0 && tipRate <= 100) {
                break;
            } else {
                System.out.println("Tip rate must be between 0 and 100.");
            }
        }
        return tipRate;
    }
    
    public static Object[] takeValues() {
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Please enter the amount of the check: ");
        float amount = scanner.nextFloat();  

        int tipRate = checkTipRate();

        return new Object[]{amount, tipRate};
    }

    public static float calculateTip(float amount, int tipRate) {
        return (amount * tipRate) / 100;
    }
    
    public static void compareTip(int tipRate) {
        if (tipRate < 15) {
            System.out.println("There is a scorpion in your pocket.");
        } else if (tipRate >= 15 && tipRate <= 25) {
            System.out.println("Thank you for the tip.");
        } else {
            System.out.println("You are being generous.");
        }
    }

    public static void main(String[] args) {
        
        Object[] values = takeValues();
        float amount = (float) values[0];
        int tipRate = (int) values[1];

        float tip = calculateTip(amount, tipRate);
        float total = amount + tip;
        
        System.out.printf("Calculated tip: %.2f%n", tip);
        System.out.printf("The check is (tip included): %.2f%n", total);
        
        compareTip(tipRate);
    }
}

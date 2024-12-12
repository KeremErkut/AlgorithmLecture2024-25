
import java.util.Scanner;

public class CiftlikciKeremEvenOddArray {
    public static void main(String[] args) {
    
        int SIZE = 10;
        int even = 0;
        int odd = 0;
        int numbers[] = new int[SIZE];
        int evenNumbers[] = new int[SIZE];
        int oddNumbers[] = new int[SIZE];
        
        Scanner keyboard = new Scanner(System.in);

        //Take the values from user.
        for(int i = 0; i < SIZE; i++){
            System.out.println("Please enter the numbers ");
            numbers[i] = keyboard.nextInt();
            
            //Seperate the odd and even numbers.
            if((numbers[i] % 2) == 0){
                evenNumbers[even] = numbers[i]; 
                even++;

                
            }else{
                 oddNumbers[odd] = numbers[i] ;
                odd++;
            }
            
        }
        
        System.out.println("The odd numbers are: ");
        for (int i = 0; i < odd; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println("\nWe have " + odd + " odd numbers.");

        System.out.println("The even numbers are: ");
        for (int i = 0; i < even; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println("\nWe have " + even + " even numbers.");
    }
}




import java.util.Scanner;
import java.util.Random;

public class CiftlikciKeremFindTheNumber {

    //Global Variables
    static int firstNumber;
    static int secondNumber;
    static int thirdNumber;
    static int fourthNumber;
    static int firstDigitGuess;
    static int secondDigitGuess;
    static int thirdDigitGuess;
    static int fourthDigitGuess;

	/**
	* This method includes headers of the game.
	* @return this method is void.
    */
	public static void headers(){
		System.out.println("                              -----KONY INTERACTIVE ENTERTAINMENT PRESENTS-----                                   ");
		System.out.println("                                           FIND THE NUMBER GAME.                                                  ");
		System.out.println("                                                                             Guess the numbers between 1 to 6.    ");
        System.out.println("");
        System.out.println("                                                                            + for correct number in correct place.");
        System.out.println("                                                                            - for correct number in wrong place.  ");
		}
	/**
	* This method generates random numbers.
	* @return this method is void.
    */
    public static void generateRandomNumbers() {
        Random rand = new Random();

        firstNumber = rand.nextInt(6) + 1;
        do {
            secondNumber = rand.nextInt(6) + 1;
        } while (firstNumber == secondNumber);

        do {
            thirdNumber = rand.nextInt(6) + 1;
        } while (firstNumber == thirdNumber || secondNumber == thirdNumber);

        do {
            fourthNumber = rand.nextInt(6) + 1;
        } while (firstNumber == fourthNumber || secondNumber == fourthNumber || thirdNumber == fourthNumber);
    }

	/**
	* This method takes the guesses from user.
	* @return this method is void.
    */
    public static void takeTheGuesses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess the first digit");
        firstDigitGuess = scanner.nextInt();
        System.out.println("Please guess the second digit");
        secondDigitGuess = scanner.nextInt();
        System.out.println("Please guess the third digit");
        thirdDigitGuess = scanner.nextInt();
        System.out.println("Please guess the fourth digit");
        fourthDigitGuess = scanner.nextInt();
    }

	/**
	* This method compares the guesses and randomly created numbers.
 	* @return this method is void.
    */
    public static void compareTheGuessesAndNumbers() {
        if (firstNumber == firstDigitGuess) {
            System.out.print("+");
        } else if (secondNumber == firstDigitGuess || thirdNumber == firstDigitGuess || fourthNumber == firstDigitGuess) {
            System.out.print("-");
        } else {
            System.out.print(" ");
        }

        if (secondNumber == secondDigitGuess) {
            System.out.print(" +");
        } else if (firstNumber == secondDigitGuess || thirdNumber == secondDigitGuess || fourthNumber == secondDigitGuess) {
            System.out.print(" -");
        } else {
            System.out.print("  ");
        }

        if (thirdNumber == thirdDigitGuess) {
            System.out.print("  +");
        } else if (firstNumber == thirdDigitGuess || secondNumber == thirdDigitGuess || fourthNumber == thirdDigitGuess) {
            System.out.print("  -");
        } else {
            System.out.print("   ");
        }

        if (fourthNumber == fourthDigitGuess) {
            System.out.print("   +");
        } else if (firstNumber == fourthDigitGuess || secondNumber == fourthDigitGuess || thirdNumber == fourthDigitGuess) {
            System.out.print("   -");
        } else {
            System.out.print("    ");
        }
        System.out.println();
    }


	/**
	* This method inclued game mechanics.
	* @return this method is void.
    */
    public static void gameMechanics(){
		for (int i = 1; i <= 10; i++) {
		            takeTheGuesses();
		            compareTheGuessesAndNumbers();

		            if (firstNumber == firstDigitGuess && secondNumber == secondDigitGuess && thirdNumber == thirdDigitGuess && fourthNumber == fourthDigitGuess) {
		                System.out.println("                                        YOU ARE VICTORIOUS!                                                        ");
		                System.out.println("");
		                System.out.println("                                 -------------CREDİTS-------------                                                ");
		                System.out.println("                                            Kerem Erkut                                                           ");
		                System.out.println("                                    Created in Elazig North Studios.                                              ");
		                System.out.println("                                               2024                                                               ");
		                return;
		            } else {
		                System.out.println("WASTED! Remaining tries: " + (10 - i));
		            }
		        }

        System.out.println("The correct numbers were: " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ", " + fourthNumber);
        System.out.println("");
		System.out.println("                                 -------------CREDİTS-------------                                                ");
		System.out.println("                                            Kerem Erkut                                                           ");
		System.out.println("                                    Created in Elazig North Studios.                                              ");
		System.out.println("                                               2024                                                               ");

		}

    public static void main(String[] args) {
        headers();
        generateRandomNumbers();
        gameMechanics();
    }
}


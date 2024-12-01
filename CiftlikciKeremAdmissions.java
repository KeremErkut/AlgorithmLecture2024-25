/*******************************************************************
@Title:	    CiftlikciKeremAdmissions
@Purpose:	To process the admimssion process.
@Author:    Ciftlikci Kerem
@Date:   	11.27.24 | Twenty Seventh of November 2024
@Version:	1.0
********************************************************************/

import java.io.*;
import java.util.Scanner;

public class CiftlikciKeremAdmissions {
    
    public static final int MIN_ACT = 20;
    public static final int MIN_SAT = 1000;
    public static final int MAX_ACT = 30;
    public static final int MAX_SAT = 1600;

    /**
    * This method validate the act score.
    * @param act First integer 
    * @return 0 <= act && MAX_ACT >= act
    */
    public static boolean validAct(int act){
        return 0 <= act && MAX_ACT >= act;
    }
    
    /**
    * This method validate the sat score.
    * @param sat First integer 
    * @return 0 <= sat && MAX_SAT >= sat
    */
    public static boolean validSat(int sat){
        return 0 <= sat && MAX_SAT >= sat;
    }

    /**
    * This method met the minimum act score.
    * @param sat First integer 
    * @return validAct(act) && MIN_ACT <= act
    */
    public static boolean metAct(int act){
        return validAct(act) && MIN_ACT <= act;
    }

    /**
    * This method met the minimum sat score.
    * @param sat First integer 
    * @return return validSat(sat) && MIN_SAT <= sat
    */
    public static boolean metSat(int sat){
        return validSat(sat) && MIN_SAT <= sat;
    }

    /**
    * This method decide the student admitted or not..
    * @param sat First integer
    * @param act Second integer 
    * @return 0 <= sat && MAX_SAT >= sat
    */
    public static boolean admitted(int sat, int act){
        return metSat(sat) || metAct(act);
    }

     /**
    * This method prints the results to the outputfile.
    * @param isAdmitted First boolean.
    * @param firstName First String.
    * @param lastName Second String.
    * @param act First integer.
    * @param sat Second Integer.
    * @param writer First Printwriter.
    * @return this method is void.
    */
    public static void outputStatus(boolean isAdmitted, String firstName, String lastName, int act, int sat, PrintWriter writer){
        if (!validAct(act) || !validSat(sat)) {
            writer.println(firstName + " " + lastName + " is out of the range ACT/SAT scores.");
            return;  
        }
        
        if (isAdmitted){
            if (metAct(act) && metSat(sat)) {
                writer.println(firstName + " " + lastName + " is admitted on ACT and SAT scores.");
            } else if (metAct(act)) {
                writer.println(firstName + " " + lastName + " is admitted on ACT score.");
            } else {
                writer.println(firstName + " " + lastName + " is admitted on SAT score.");
            }
        } else {
            writer.println(firstName + " " + lastName + " is not admitted (ACT and SAT scores are below minimum).");
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner keyboard = new Scanner(System.in);

        System.out.println("SHSU ADMISSION PROGRAM  2024");
        System.out.print("Enter the name which includes student applications: ");
        String inputFileName = keyboard.nextLine();
        System.out.print("Enter the name of the file to save files: ");
        String outputFileName = keyboard.nextLine();

        Scanner inputFile = new Scanner(new File(inputFileName));
        PrintWriter outputFile = new PrintWriter(new File(outputFileName));

        while (inputFile.hasNext()){
            String firstName = inputFile.next();
            String lastName = inputFile.next();
            int act = inputFile.nextInt();
            int sat = inputFile.nextInt();
            boolean isAdmitted = admitted(sat, act);
            outputStatus(isAdmitted, firstName, lastName, act, sat, outputFile);
        }

        System.out.println("The results have been written to " + outputFileName);
   
        inputFile.close();
        outputFile.close();
    }
}

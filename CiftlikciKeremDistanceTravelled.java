/*******************************************************************
@Title:	CiftlikciKeremDistanceTravelled
@Purpose:	For Lab3
@Author:    Ciftlikci Kerem 
@Date:   	10/27/24 | 27th of October 2024
@Version:	1.0
********************************************************************/
import javax.swing.JOptionPane;

public class CiftlikciKeremDistanceTravelled{

    public static void main(String[] args) {
        
        //Take the value from user 
        String second = JOptionPane.showInputDialog(" How many seconds passed ?");
        Double mySecond = Double.parseDouble(second);

        //Square the value for formula using [ Math.pow(); ]
        Double second_square =  Math.pow(mySecond, 2);

        //Calculate the distance using distance formula ----> [d = (1/2)gt2]
        Double distance = (32.174 * second_square)/2 ;

        //Show the result to user.
        JOptionPane.showMessageDialog(null, distance + " ft travelled.");       
    }
}

//CALCULATE FOR 50 SECONDS

/*******************************************************************
@Title:	    PetDriver
@Purpose:	To understand OOP foundations.
@Author:    Ciftlikci Kerem
@Date:   	12.8.24 | Eighth of December 2024
@Version:	1.0
********************************************************************/
public class CiftlikciKeremPetDriver {
    public static void main(String[] args) {
        //Create a pet object
        Pet baldEagle = new Pet();
        Pet brownBear = new Pet();

        //Take inputs for baldeagle.
        baldEagle.setName("Yankee");
        baldEagle.setAge(248);
        baldEagle.setLocation("Alaska");
        
        //Take inputs for brownbear
        brownBear.setName("Ivan");
        brownBear.setAge(303);
        brownBear.setLocation("Siberia");
        
        System.out.println(baldEagle.getCompleteInfo());

        System.out.println(brownBear.getCompleteInfo());
        
    }
}

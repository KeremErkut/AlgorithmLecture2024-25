/*******************************************************************
@Title:	    Pet
@Purpose:	To understand OOP foundations.
@Author:    Ciftlikci Kerem
@Date:   	12.8.24 | Eighth of December 2024
@Version:	1.0
********************************************************************/
public class Pet {
    private String name;
    private String location;
    private int age;
    
    
    /*The setName() sets a String value to the name 
     * @param1 n will be store the name of the pet
     * @return void
     */
    public void setName(String n){
        name = n;
    }

    /*The setAge() sets a int value to the age 
     * @param1 a will be store the age of pet
     * @return void
     */
    public void setAge(int a){
        age = a;
    }

    /*The setLocation() sets a String value to the location
    * @param1 l will be store the location of the pet
    * @return void
    */
    public void setLocation(String l){
        location = l;
    }
    
    /*The getName() returns the name of the object
    * @return name;
    */ 
    public String getName (){
        return name;
    }

    /*The getAge() returns the age of the object
    * @return age;
    */ 
    public int getAge(){
        return age;
    }

    /*The getLocation() returns the location of the object
    * @return location;
    */ 
    public String getLocation(){
        return location;
    }

    /*The getCompleteInfo() returns the all information of the object
    * @return name, age, location;
    */
    public String getCompleteInfo(){
        return "NAME: " + name + " AGE: " + age + " LOCATION: " + location;
    }
    
    
}

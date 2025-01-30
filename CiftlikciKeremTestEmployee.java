/*******************************************************************
 @Title:	CiftlikciKeremTestEmployee
 @Purpose:	To write an amazing java program that solves the problem!
 @Author:   Ciftlikci Kerem
 @Date:   	1.10.2025
 @Version:	1.0
 ********************************************************************/
public class CiftlikciKeremTestEmployee {
    public static void main(String[] args) {
        CiftlikciKeremEmployee employee1 = new CiftlikciKeremEmployee();
        CiftlikciKeremEmployee employee2 = new CiftlikciKeremEmployee();

        employee1.setName("Kerem");
        employee1.setId(999);
        employee1.setSalary(5000);
        employee1.setAge(20);
        employee1.setPosition("The coolest software engineering student");
        employee1.setDepartment("Universe");
        employee1.setPhoneNumber(123456789);
        employee1.setMailAdress("kerem@coolest.com");

        employee2.setName("Jeff");
        employee2.setId(666);
        employee2.setSalary(2000);
        employee2.setAge(60);
        employee2.setPosition("Intern");
        employee2.setDepartment("Archive");
        employee2.setPhoneNumber(987654321);
        employee2.setMailAdress("jeff@forest.com");


        System.out.println("                     UNIVERSE'S COOLEST COMPANY INC");
        System.out.println("                            Employee Databese");
        System.out.println("");
        System.out.println("1st Employee : " + employee1.getName());
        System.out.println("Id : " + employee1.getId());
        System.out.println("Salary : " + employee1.getSalary());
        System.out.println("Federal Tax : " + employee1.getFedTax());
        System.out.println("Social Security Tax : " + employee1.getSsTax(6));
        System.out.println("Health Fee : " + employee1.getHealthFee(5));
        System.out.println(("Net Pay : " + employee1.getNetPay()));
        System.out.println("Age : " + employee1.getAge());
        System.out.println("Position : " + employee1.getPosition());
        System.out.println("Department : " + employee1.getDepartment());
        System.out.println("Phone Number : " + employee1.getPhoneNumber());
        System.out.println("Mail Adress : " + employee1.getMailAdress());
        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println("2nd Employee : " + employee2.getName());
        System.out.println("Id : " + employee2.getId());
        System.out.println("Salary : " + employee2.getSalary());
        System.out.println("Federal Tax : " + employee2.getFedTax());
        System.out.println("Social Security Tax : " + employee2.getSsTax(6));
        System.out.println("Health Fee : " + employee2.getHealthFee(5));
        System.out.println(("Net Pay is : " + employee2.getNetPay()));
        System.out.println("Age : " + employee2.getAge());
        System.out.println("Position : " + employee2.getPosition());
        System.out.println("Department : " + employee2.getDepartment());
        System.out.println("Phone Number : " + employee2.getPhoneNumber());
        System.out.println("Mail Adress : " + employee2.getMailAdress());
        System.out.println(" ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                     Developed at IMB Laboratories :-)");
        System.out.println("                                  2025");
    }
}

/*******************************************************************
 @Title:	CiftlikciKeremEmployee
 @Purpose:	To write an amazing java program that solves the problem!
 @Author:   Ciftlikci Kerem
 @Date:   	(1.10.2025)
 @Version:	1.0
 ********************************************************************/
public class CiftlikciKeremEmployee {
    private String name;
    private int id;
    private double salary;
    private int age;
    private String position;
    //I added these three features for improve information about employee
    private String department;
    private int phoneNumber;
    private String mailAdress;

    public CiftlikciKeremEmployee(){}

    public CiftlikciKeremEmployee(String name, int id, double salary, int age, String position, String department, int phoneNumber, String mailAdress) {}

    public void setName(String fullName) {
        name = fullName;
    }

    public void setId(int idNumber) {
        id = idNumber;
    }

    public void setSalary(double sal){
        salary = sal;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setPosition(String pos){
        position = pos;
    }

    public void setDepartment(String dep){
        department = dep;
    }

    public void setPhoneNumber(int phone){
        phoneNumber = phone;
    }

    public void setMailAdress(String mail){
        mailAdress = mail;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getMailAdress() {
        return mailAdress;
    }
/// //////////////////////////////////////////////////////
    public int getFedTax(){
        double fedTax = (getSalary() - 800)*(0.17);
        return (int)Math.ceil(fedTax);
    }

    public int getSsTax(int rate){
        double ssTax = getSalary() * (rate / 100.0);
        return (int)Math.ceil(ssTax);
    }

    public int getHealthFee(int rate){
        double healthFee = getSalary() * (rate / 100.0);
        return (int)Math.ceil(healthFee);
    }

    public int getInsurance(){
        int rate;
        if(getAge() < 30){
            return rate = (int) (getSalary() * 0.02);
        }else if (getAge() >= 30 && getAge() < 50){
            return rate = (int) (getSalary() * 0.03);
        }else if (getAge() >= 50 && getAge() < 70){
            return rate = (int) (getSalary() * 0.04);
        }else{
            return rate = (int) (getSalary() * 0.1);
        }

    }

    public double getNetPay(){
        double netPay = getSalary() - ( getFedTax() + getInsurance() + getHealthFee(5) + getSsTax(6) );
        return netPay;
    }

}

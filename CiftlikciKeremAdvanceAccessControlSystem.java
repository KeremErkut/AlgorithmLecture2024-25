/*******************************************************************
@Title:	    CiftlikciKeremAdvanceAccessControlSystem
@Purpose:	To understand basics in java
@Author:    Ciftlikci Kerem 
@Date:   	11/12/24 | 12th of November 2024
@Version:	1.0
********************************************************************/

import java.util.Scanner;

public class CiftlikciKeremAdvanceAccessControlSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String role;
        int securityLevel, currentTime;

        System.out.print("Type the role : ADMIN, USER, GUEST\n");
        role = scanner.next().toUpperCase();
        if (!role.equals("ADMIN") && !role.equals("USER") && !role.equals("GUEST")) {
            System.out.println("Invalid role. Access DENIED.");
            scanner.close();
            return;
        }

        System.out.println("Type the security level 1 to 5:");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid security level. Access DENIED.");
            scanner.close();
            return;
        }
        
        securityLevel = scanner.nextInt();
        if (securityLevel < 1 || securityLevel > 5) {
            System.out.println("Invalid security level. Access DENIED.");
            scanner.close();
            return;
        }

        System.out.println("Type the current time 0 to 23:");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid time. Access DENIED.");
            scanner.close();
            return;
        }
        
        currentTime = scanner.nextInt();
        if (currentTime < 0 || currentTime > 23) {
            System.out.println("Time out of range. Access DENIED.");
            scanner.close();
            return;
        }

        if (isAccessGranted(role, securityLevel, currentTime)) {
            System.out.println("Access GRANTED.");
        } else {
            System.out.println("Access DENIED.");
        }

        scanner.close();
    }

    public static boolean isAccessGranted(String role, int securityLevel, int currentTime) {
        if (securityLevel == 5) {
            return false; 
        }
        
        switch (role) {
            case "ADMIN":
                if (securityLevel >= 4) {
                    return true; 
                }
                break;

            case "USER":
                if (securityLevel >= 3 && currentTime >= 9 && currentTime < 17) {
                    return true; 
                }
                break;

            case "GUEST":
                if (securityLevel >= 2 && currentTime >= 10 && currentTime < 16) {
                    return true; 
                }
                break;
        }

        return false; 
    }
}

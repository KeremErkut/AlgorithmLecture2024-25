/*******************************************************************
 @Title:	CiftlikciKeremWashingtonTemp
 @Purpose:	To write an amazing java program that solves the problem!
 @Author:   Ciftlikci Kerem
 @Date:   	1.10.2025
 @Version:	1.0
 ********************************************************************/
import java.util.Random;
public class CiftlikciKeremWashingtonTemp {

    public static void generateRandomArray(int[] arr, int n) {

        Random rand = new Random();
        int day = 0;

        for (int i = 0; i < n; i++){
            int currentDayOfYear = day + 1;

            //Create if else structure for keep the random temperatures between the desired range for each different month. (e.g., 28-38 for Jan, 28-40 for Feb).
            if (currentDayOfYear <= 31) {
                // Jan
                arr[i] = rand.nextInt(11) + 28;
            } else if (currentDayOfYear <= 60) {
                // Feb
                arr[i] = rand.nextInt(13) + 28;
            } else if (currentDayOfYear <= 91) {
                // Mar
                arr[i] = rand.nextInt(13) + 36;
            } else if (currentDayOfYear <= 120) {
                // Apr
                arr[i] = rand.nextInt(14) + 45;
            } else if (currentDayOfYear <= 151) {
                // May
                arr[i] = rand.nextInt(13) + 56;
            } else if (currentDayOfYear <= 181) {
                // Jun
                arr[i] = rand.nextInt(15) + 63;
            } else if (currentDayOfYear <= 212) {
                // Jul
                arr[i] = rand.nextInt(12) + 72;
            } else if (currentDayOfYear <= 243) {
                // Aug
                arr[i] = rand.nextInt(12) + 64;
            } else if (currentDayOfYear <= 273) {
                // Sep
                arr[i] = rand.nextInt(15) + 51;
            } else if (currentDayOfYear <= 304) {
                // Oct
                arr[i] = rand.nextInt(12) + 43;
            } else if (currentDayOfYear <= 334) {
                // Nov
                arr[i] = rand.nextInt(11) + 33;
            } else {
                // Dec
                arr[i] = rand.nextInt(12) + 50;
            }

            day++;
        }
    }

    //You can see the temperature for each day using this function.
    public static void printArray(int[] arr) {
       int dayCount = 0;
        for (int i = 0; i < arr.length; i++) {
            dayCount++;
            System.out.print("Day:" + dayCount + " Temperature:" +arr[i] +  "F\n" );
        }
    }

    public static void calculateAverageTemperature(int[] daysOfYear, int[] daysOfMonth) {
        double[] totalTempForMonth = new double[12];
        double[] averageTempForMonth = new double[12];
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int dayCount = 0;
        int month = 0;
        for (int i = 0; i < daysOfYear.length; i++) {
            totalTempForMonth[month] += daysOfYear[i];
            dayCount++;

            if (dayCount == daysOfMonth[month]) {
                // Calculate average temperature for the month
                averageTempForMonth[month] = totalTempForMonth[month] / daysOfMonth[month];
                month++;
                dayCount = 0;
            }


            if (month == 12) {
                break;
            }
        }


        for (int i = 0; i < averageTempForMonth.length; i++) {
            System.out.printf("The average temperature in %s: %.1fF \n", months[i], averageTempForMonth[i]);
        }
    }

    //I am using bubble sort for sort the temperature values for the whole year.
    public static int[] sortTheArray(int[] arr) {
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            sortedArr[i] = arr[i];
        }

        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < sortedArr.length - 1 ; i++) {
                if (sortedArr[i] > sortedArr[i + 1]) {
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return sortedArr;
    }

    public static void findTheExtremumTemps(int[] sortedArr, int[] daysOfYear) {
        int coldestTemp = sortedArr[0];
        int hottestTemp = sortedArr[sortedArr.length - 1];
        int coldestDay = 1;
        int hottestDay = 1;

        for(int i = 0; i < daysOfYear.length; i++) {
            if(daysOfYear[i] == coldestTemp) {
                coldestDay = i + 1; // index + 1 for actual day
            }
            if(daysOfYear[i] == hottestTemp) {
                hottestDay = i + 1; // index + 1 for actual day
            }
        }

        int coldestMonth = getMonth(coldestDay);
        int hottestMonth = getMonth(hottestDay);

        String coldestDayOfWeek = getDayOfWeek(coldestDay);
        String hottestDayOfWeek = getDayOfWeek(hottestDay);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.printf("The coldest day was %s, %s %d with a temperature of %dF.\n", coldestDayOfWeek, months[coldestMonth], coldestDay - getDaysBeforeMonth(coldestMonth), coldestTemp);
        System.out.printf("The hottest day was %s, %s %d with a temperature of %dF.\n", hottestDayOfWeek, months[hottestMonth], hottestDay - getDaysBeforeMonth(hottestMonth), hottestTemp);
    }


    public static int getMonth(int dayOfYear) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for(int i = 0; i < daysInMonths.length; i++) {
            totalDays += daysInMonths[i];
            if(dayOfYear <= totalDays) {
                return i;
            }
        }
        return 11;
    }

    public static String getDayOfWeek(int dayOfYear){
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        return daysOfWeek[(dayOfYear - 1) % 7];
    }

    public static int getDaysBeforeMonth(int month) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 0; i < month; i++) {
            totalDays += daysInMonths[i];
        }
        return totalDays;
    }

    public static void isBelowIsAbove(int[]sortedArr){
        int belowCount = 0;
        int aboveCount = 0;
        for(int i = 0; i < sortedArr.length; i++){
            if(sortedArr[i] < 33){
                belowCount++;
            } else if (sortedArr[i] > 75){
                aboveCount++;
            }
        }
        System.out.println("There were " + belowCount +  " days where the temperature was below 33 degrees ");
        System.out.println("There were " + aboveCount + " days where the temperature was above 75 degrees ");
    }

    public static void printWholeInfo(){
        // Array for the days of year
        int[] daysOfYear = new int[365];

        // Array for the number of days in each month
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Generate random temperatures for the year
        generateRandomArray(daysOfYear, daysOfYear.length);

        // Sort the temperature array
        int[] sortedArr = sortTheArray(daysOfYear);

        // Print temperatures for the year
        //printArray(daysOfYear);

        // Calculate and display average temperatures for each month
        calculateAverageTemperature(daysOfYear, daysOfMonth);

        // Find and display the coldest and hottest days
        findTheExtremumTemps(sortedArr, daysOfYear);

        // Count the number of days with temperatures below 33F and above 75F
        isBelowIsAbove(sortedArr);
    }

    public static void main(String[] args) {
        printWholeInfo();
    }
}

/*******************************************************************
@Title:	    CiftlikciKeremWatherCalculation
@Purpose:	To understand methods and arrays in java.
@Author:    Ciftlikci Kerem
@Date:   	12.21.24 | Twenty First of November 2024
@Version:	1.0
********************************************************************/
public class CiftlikciKeremWatherCalculation {

    public static void printWholeInfo(double averageTenth, double averageEleventh, double differenceTenth, double differenceEleventh, double determineTenth, double determineEleventh){
        System.out.printf("Average Tempeture of November 10th : %.2f°C\n", averageTenth);
        System.out.printf("Average Tempeture of November 11th : %.2f°C\n", averageEleventh);
        System.out.printf("Daily Tempeture difference of November 10th : %.2f°C\n", differenceTenth);
        System.out.printf("Dailiy Tempeture difference of November 11th : %.2f°C\n", differenceEleventh);
        System.out.printf("The total hourly tempeture variation for November 10th : %.2f°C\n", determineTenth);
        System.out.printf("The total hourly tempeture variation for November 11th: %.2f°C\n", determineEleventh);
    }

    public static double findTheDifferenceTemp(double[] array){
        double difference = findTheHighestTemp(array) - findTheLowestTemp(array);
        return difference;
    }

    public static double findTheHighestTemp(double[] array){
        double highest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }

    public static double findTheLowestTemp(double[] array){
        double lowest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }

    public static double determineTheTempVariation(double[] array){
        double hourlyTempVariation = 0;

        for (int i = 1; i < array.length; i++) {
            double absolute = array[i] - array[i - 1];

            if (absolute < 0) {
                absolute = -absolute;
            }

            hourlyTempVariation += absolute;
        }

        return hourlyTempVariation;
    }

    public static double[] convertFahrenheitToCelsius(int[] fahrenheitArray) {
        double[] celsiusArray = new double[fahrenheitArray.length];

        for (int i = 0; i < fahrenheitArray.length; i++) {
            celsiusArray[i] = (5.0 / 9) * (fahrenheitArray[i] - 32);
        }

        return celsiusArray;
    }

    public static double calculateAverage(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {
        int ARRAY_SIZE = 12;
        int[] tenthOfNovember = {45, 49, 53, 55, 60, 65, 70, 72, 68, 63, 58, 53};
        int[] eleventhOfNovember = {42, 46, 50, 54, 59, 64, 69, 71, 67, 62, 57, 52};

        double[] newTenthOfNovember = convertFahrenheitToCelsius(tenthOfNovember);
        double[] newEleventhOfNovember = convertFahrenheitToCelsius(eleventhOfNovember);

        double averageTenth = calculateAverage(newTenthOfNovember);
        double averageEleventh = calculateAverage(newEleventhOfNovember);

        double differenceTenth = findTheDifferenceTemp(newTenthOfNovember);
        double differenceEleventh = findTheDifferenceTemp(newEleventhOfNovember);

        double determineTenth = determineTheTempVariation(newTenthOfNovember);
        double determineEleventh = determineTheTempVariation(newEleventhOfNovember);

        printWholeInfo(averageTenth, averageEleventh, differenceTenth, differenceEleventh, determineTenth, determineEleventh);
    }
}

import java.util.*;

public class TemperatureReadingsApp {
    public static void main(String[] args) {
        double[] temperature = new double[7];
        enterTemps(temperature);
        wasHot(temperature); // calling the method displaying the temperatures over 18
        System.out.println("***TEMPERATURES ENTERED***");
        displayTemps(temperature);
        convertToFarenheit(temperature); // calling the updated farenheit list
        System.out.println("***TEMPERATURES IN FARENHEIT***");
        displayTemps(temperature); // displaying the updated temperature list

    }

    static void enterTemps(double[] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < temperatureIn.length; i++) {
            System.out.print("enter max temperature for day " + (i + 1) + ": ");
            temperatureIn[i] = keyboard.nextDouble();
        }
    }

    static void displayTemps(double[] temperatureIn) {
        System.out.println();
        for (int i = 0; i < temperatureIn.length; i++) {
            System.out.println("day " + (i + 1) + " " + temperatureIn[i]);
        }
    }

    static void wasHot(double[] temperatureIn) //accepts the temperature array and displays temperatures over 18
    {
        System.out.println(" ");
        System.out.println("***TEMPERATURES >=18***");
        for (double item : temperatureIn) {
            if (item >= 18) //prints the temperature if >= 18
            {

                System.out.println(item);
            }
        }
    }

    static void convertToFarenheit(double[] temperatureIn) // converts the celsius to farenheit
    {
        System.out.println(" ");
        for (int i = 0; i < temperatureIn.length; i++) // for loop in order to read through the values in the array
        {
            temperatureIn[i] = ((temperatureIn[i] * 9) / 5) + 32; //formula
            // temperature is now updated with farenheit values
        }
    }

}


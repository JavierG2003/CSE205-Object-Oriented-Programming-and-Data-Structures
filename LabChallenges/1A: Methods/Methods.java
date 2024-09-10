/* Javier Gomez Tagle
 * Professor Phil Miller
 * CSE 205
 * 27 August 2024
 * 
 * This program has five different methods: one that converts temperature from
 * fahrenheit to celsius; one that converts distance from yards to feet and 
 * inches; one that takes words and makes them into an acronym; one that
 * creates a triangle based on inputted size, a selected number to appear for 
 * its border, and a selected number to appear for its interior; and a last
 * method to exit the program.
 */

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Continue serving method selection menu
        // until "Exit" option is selected
        int selection;
        do {
            System.out.print(
                "\nMethod Selection Menu\n" +
                "=======================\n" +
                "1. Temperature Conversion (Fahrenheit to Celsius)\n" +
                "2. Distance Conversion (Yards to Feet and Inches)\n" +
                "3. Get Acronym\n" +
                "4. Triangle Generator\n" +
                "5. Exit\n" +
                "=======================\n" +
                "Enter selection (1-5): "
            );
            try {
                selection = Integer.parseInt(scnr.next());
            } catch(NumberFormatException ex) {
                selection = 0;
            }
            switch (selection) {
                case 1:
                    doTempConversion(scnr);
                    break;
                case 2:
                    doDistConversion(scnr);
                    break;
                case 3:
                    // flush input buffer
                    if (scnr.hasNextLine()) scnr.nextLine();

                    doGetAcronym(scnr);
                    break;
                case 4:
                    doTriangle(scnr);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error: Invalid option");
            }
        } while (selection != 5);
        scnr.close();
    }

    public static void doTempConversion(Scanner scnr) {
        // Below this comment: declare any other variables you may need
        // to store the user's input and the Celsius equivalent value
        double fahrenheit = 0.0;
        double celsius = 0.0;

        // Below this comment: prompt the user to enter the required input(s)
        System.out.print("Enter temperature in Fahrenheit : ");

        // Below this comment: collect the required inputs from the user
        fahrenheit = scnr.nextDouble();

        // Below this comment: call your FahrenheitToKelvin method
        celsius = fahrenheittoCelsius(fahrenheit);

        // Below this comment: display the required results
        System.out.printf("%.2f degrees Fahrenheit is %.2f Celsius\n", fahrenheit, celsius);
    }


    public static void doDistConversion(Scanner scnr) {
        // Below this comment: declare any other variables you may need
        // to store the user's input and the Feet and Inches equivalent value
        double yards = 0.0;
        String feetAndInches = "";

        // Below this comment: collect the required inputs
        System.out.print("Enter distance in Yards : ");
        yards = scnr.nextDouble();

        // Below this comment: call your yardsToFeetAndInches method
        feetAndInches = yardsToFeetAndInches(yards);

        // Below this comment: display the required results
        System.out.printf("%.2f yards in Feet and Inches is : %s\n", yards, feetAndInches);
    }

    public static void doGetAcronym(Scanner scnr) {
        // Below this comment: declare any other variables you may need
        String someWords = "";
        String acronym = "";

        // Below this comment: collect the required inputs
        System.out.print("Enter some words : ");
        someWords = scnr.nextLine();

        // Below this comment: call your required method
        acronym = getAcronym(someWords);

        // Below this comment: display the required results
        System.out.printf("Acronym for %s : %s\n", someWords, acronym);
    }
    
    // Part 01: Temperature Conversion ========== ========== ==========
    // define your fahrenheitToCelsius method here below
    public static double fahrenheittoCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
    
    // Part 02: Distance Conversion ========== ========== ========== ==
    // define your yardsToFeetAndInches method here below
    public static String yardsToFeetAndInches(double yards) {
        double totalInches = yards * 36;
        int feet = (int)totalInches / 12;
        double inches = totalInches % 12;

        return String.format("%d\' %.2f\"", feet, inches);
    }
 
    // Part 03: Get Acronym ========== ========== ========== ==========
    // define your getAcronym method here below
    public static String getAcronym(String someWords) {
        // The first letter of the acronym
        // will be the first letter of the parameter String.
        String acronym = someWords.substring(0, 1);
        // Find the position (index) of the first space
        int spaceIndex = someWords.indexOf(" ");
        // while there is a space
        while (spaceIndex != -1) {
            // get the character after the space
            // and add it to the acronym
            acronym += someWords.substring(spaceIndex + 1, spaceIndex + 2);
            // then find the position (index) of the next space
            spaceIndex = someWords.indexOf(" ", spaceIndex + 1);
        }
        // return the acronym (in uppercase)
        return acronym.toUpperCase();
    }
 
    // Part 04: Triangle Generator ========== ========== ========== ===
    // complete your required doTriangle method here below
    public static void doTriangle(Scanner scnr) {
        // Below this comment: declare any other variables you may need
        int size;
        String border, interior;

        // Below this comment: collect the required inputs
        System.out.print("Enter size     : ");
        size = scnr.nextInt();

        System.out.print("Enter border     : ");
        border = scnr.next();

        System.out.print("Enter interior     : ");
        interior = scnr.next();

        // Below this comment: display the required results
        for (int line = 1; line <= size; line++) {
            for (int col = 0; col < line; col++) {
                if (col == 0 || col == line - 1 || line == size)
                    System.out.print(border);
                else
                    System.out.print(interior);
            }
            System.out.println();
        }
        
    }
}

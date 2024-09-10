/* Javier Gomez Tagle
 * Professor Phil Miller
 * CSE 205
 * 8 September 2024
 * 
 * Using a public static method, this program will take in a single argument in
 * the form of a double and return a double. When called, and passed a
 * temperature value (in Fahrenheit), this method will compute and return the
 * Kelvin equivalent.
 */

 import java.util.Scanner;

 public class TempConversion { 
     public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scanner = new Scanner(System.in);
        
      // Below this comment: declare any other variables you may need
      // to store the user's input and the Kelvin equivalent value
      double fahrenheit;
      double kelvin;
  
      // Below this comment: collect the requried inputs from the user
      System.out.print("Enter temperature in Fahrenheit : ");
      fahrenheit = scanner.nextDouble();
  
      // Below this comment: call your FahrenheitToKelvin method
      kelvin = fahrenheitToKelvin(fahrenheit);
  
      // Below this comment: display the required results
      System.out.printf("%.2f degrees from Fahrenheit to Kelvin is %.2f%n", fahrenheit, kelvin);
 
      scanner.close();
            
     }
     
     public static double fahrenheitToKelvin(double fahrenheit) {
         return (fahrenheit - 32) * 5 / 9 + 273.15;
     }  
  }
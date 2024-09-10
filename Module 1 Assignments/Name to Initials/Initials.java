/* Javier Gomez Tagle
 * Professor Phil Miller
 * CSE 205
 * 8 September 2024
 * 
 * This program will take in a string, whether it be a combination of first,
 * middle, and/or last names, and convert the string into initials for the
 * individual.
 */
import java.util.Scanner;

public class Initials {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scanner = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      String name;
      String initials;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter name : ");
      name = scanner.nextLine();
      
      // Below this comment: call your required method
      initials = toInitials(name);

      // Below this comment: display the required results
      System.out.println("For " + name + " initials are : " + initials);

      scanner.close();
      
   }
   
   // define your required method here below
   public static String toInitials(String name) {
    name = name.trim();
    String initials = "";
    String[] nameParts = name.split(" ");

    for (String part : nameParts) {
        if(!part.isEmpty()) {
            initials += part.charAt(0) + ". ";
        }
    }

    return initials.trim();
   }
   
}

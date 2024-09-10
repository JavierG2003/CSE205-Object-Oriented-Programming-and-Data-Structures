/* Javier Gomez Tagle
 * Professor Phil Miller
 * CSE 205
 * 8 September 2024
 * 
 * This program will make a box given dimensions for the width and height, as
 * well as chosen characters for the interior and border.
 */

// Below this comment: import the Scanner
import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
       // Below this comment: declare and instantiate a Scanner
       Scanner scanner = new Scanner(System.in);
       
       // Below this comment: declare any other variables you may need
       int width, height;
       char interiorChar, borderChar;
       
       // Below this comment: collect the required inputs
       System.out.print("Enter width : ");
       width = scanner.nextInt();
       System.out.print("Enter height : ");
       height = scanner.nextInt();
       System.out.print("enter interior : ");
       interiorChar = scanner.next().charAt(0);
       System.out.print("Enter border : ");
       borderChar = scanner.next().charAt(0);
       
       // Below this comment: display the required results
       for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                System.out.print(borderChar);
            } else {
                System.out.print(interiorChar);
            }
        }
        System.out.println();
       }

       scanner.close();
    }
 }
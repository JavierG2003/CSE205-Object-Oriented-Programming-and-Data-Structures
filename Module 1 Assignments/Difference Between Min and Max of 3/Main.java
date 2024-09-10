/* Javier Gomez Tagle
 * Professor Phil Miller
 * CSE 205
 * 8 September 2024
 * 
 * This program will take three integers, and then return the positive
 * difference between the greatest and least integers input.
 */

 public class Main {
    public static void main(String[] agrs) {
       // you may write code in this main method to test your required method
       System.out.println(minMaxDiff(1, 2, 3));
       System.out.println(minMaxDiff(50, 10, 20));
       System.out.println(minMaxDiff(1, 1, 1));
       System.out.println(minMaxDiff(50, 100, 10));
    }
    
    // define your required method here below
    public static int minMaxDiff(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max - min;
    }
 }
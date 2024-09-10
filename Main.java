/* Javier Gomez Tagle
 * Professor Phil Miller
 * CSE 205
 * 10 September 2024
 * 
 * This program has five different methods that can make different computations
 * on static arrays of integers, and then return the result as either a single 
 * integer or another static array of integers.
 */

 public class Main {
    public static void main(String[] args) {
        // feel free to modify this main method to call any of the below 
        // methods
        int[] myArray = {1, 3, 6, 15};
        int[] differences = getDifferences(myArray);

        for(int value : differences)
        System.out.println(value + ", ");
        System.out.println();
    }

    public static int sumOfOdds(int[] array) {
        // initialize a sum to zero
        int sum = 0;

        // for each value in the array
        for (int value : array) {
            // if this value is odd...
            if (value % 2 == 1)
                // then add this value to the sum
                sum += value;
        }

        // return the sum
        return sum;
    }

    public static int[] getMinAndMax (int[] array) {
        // create an array with two elements
        int[] minAndMax = {array[0], array[0]};

        // look at each value in the argument array
        for (int value : array) {
            // if it is the smallest so far, then store it
            if (value < minAndMax[0])
                minAndMax[0] = value;
            // if it is the largest so far, then store it
            if (value > minAndMax[1])
                minAndMax[1] = value;
        }

        // return the min and max
        return minAndMax;
    }

    public static int range(int[] array) {
        int[] minAndMax = getMinAndMax(array);

        return minAndMax[1] - minAndMax[0];
        
        /*
        We would get the same result with the code below:

        int min = array[0];
        int max = array[0];

        for (int value : array) {
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }

        return max - min;
        */
    }

    public static int getSecondLargest(int[] array) {
        // initialize variables for largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // look at each value in the array
        for (int index = 0; index < array.length; index++) {
            // is this the largest so far...
            if (array[index] > largest) {
                secondLargest = largest;
                largest = array[index];
            }
            // else is this the second largest so far...
            else if (array[index] > secondLargest) {
                secondLargest = array[index];
            }
        }

        // return the second largest
        return secondLargest;
    }

    public static int[] getDifferences(int[] arr) {
        int[] differences = new int[arr.length - 1];

        for(int index = 0; index < arr.length - 1; index++) {
            int difference = arr[index + 1] - arr[index];
            differences[index] = difference;
        }

        return differences;
    }
}
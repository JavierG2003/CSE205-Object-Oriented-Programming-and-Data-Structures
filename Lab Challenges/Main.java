import java.util.ArrayList;

/**
 * Javier Gomez Tagle
 * Professer Meuth Miller
 * CSE 205
 * 17 September 2024
 * 
 * This program will use one of five methods that perform a computation on a
 * single or pair of ArrayLists.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<Integer>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        System.out.println(allLessThanMean(list));
    }

    public static ArrayList<Integer> allLessThanMean(ArrayList<Integer> list) {
        // declare and initialize needed variables
        ArrayList<Integer> lessThanMean = new ArrayList<Integer>();
        int sum = 0;
        double mean;
        // compute the sum of the list
        for (int value : list)
            sum += value;
        // compute the mean of the list
        mean = (double)sum / (double)list.size();
        // search the list
        for (int value : list)
            // add values less than the mean to output list
            if (value < mean)
                lessThanMean.add(value); 

        // return the output list
        return lessThanMean;
    }
}
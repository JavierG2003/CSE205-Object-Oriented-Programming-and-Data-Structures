/**
 * Javier Gomez Tagle
 * Professer Phil Miller
 * CSE 205
 * 17 September 2024
 * 
 * This program will use one of five methods that perform a computation on a
 * single or pair of ArrayLists.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =  new ArrayList<Integer>();
        list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4); list2.add(4); list2.add(5); list2.add(7); list2.add(9);
        System.out.println(symmetricDiff(list1, list2));
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

    public static ArrayList<Double> distancesFromMean(ArrayList<Integer> list) {
        // declare and initialize needed variables
        ArrayList<Double> newList = new ArrayList<Double>();
        int sum = 0;
        double mean, distance;
        // compute the sum of the list
        for (int value : list)
            sum += value;
        // compute the mean of the list
        mean = (double)sum / (double)list.size();
        // for each value in the argument list
        for (int value : list) {
            // compute the difference from the mean
            distance = Math.abs(value - mean);
            // add this value to the output list
            newList.add(distance);
        }
        // return the output list
        return newList;
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // create an output list
        ArrayList<Integer>inCommon = new ArrayList<Integer>();
        // look at each value in list1
        for (int value : list1) {
            // if value in list2 and not already in output list...
            if (list2.contains(value) && !inCommon.contains(value))
                // then add value to the output list
                inCommon.add(value);
        }
        // return the output list
        return inCommon;
    }

    public static ArrayList<Integer> symmetricDiff(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // create an output list
        ArrayList<Integer> symDiff = new ArrayList<Integer>();
        
        // search list1
        for (int value : list1) {
            // for values not in list2 and not in output list
            if (!list2.contains(value) && ! symDiff.contains(value))
                // and add them to the output list
                symDiff.add(value);
        }
        
        // search list2
        for (int value : list2) {
            // for values not in list1 and not in output list
            if (!list1.contains(value) && ! symDiff.contains(value))
                // and add them to the output list
                symDiff.add(value);
        }
        
        // return the output list
        return symDiff;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // declare and initalize an output list
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        // declare and initialize any other needed variables
        int index1 = 0, index2 = 0;

        // while both list1 and list2 have more values to be copied
        while (index1 < list1.size() && index2 < list2.size()) {
            // if the value in list1 is less than next value in list2
            if (list1.get(index1) < list2.get(index2)) {
                // add next value in list1 to output list
                mergedList.add(list1.get(index1));
                // move to the next item in list1
                index1++;
            }
            // else
            else {
                // add next value in list2 to output list
                mergedList.add(list2.get(index2));
                // move to the next item in list2
                index2++;
            }
        }
        // while list1 has morte values to be copied
        while (index1 < list1.size()) {
            // add next value in list1 to output list
            mergedList.add(list1.get(index1));
            // move to the next item in list1
            index1++;
        }
        // while list2 has more values to be copied
        while (index2 < list2.size()) {
            // add next value in list2 to output list
            mergedList.add(list2.get(index2));
            // move to the next item in list2
            index2++;
        }
        // return the output list
        return mergedList;
    }
}

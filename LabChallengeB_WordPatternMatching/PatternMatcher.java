/* Javier Gomez Tagle
 * Professor Phil Miller
 * CSE 205: Object-Oriented Programming and Data Structures
 * 3 September 2024
 * 
 * This program can read from a file, and then identify words from a file that
 * match a pattern identified by certain quantities of characters and 
 * underscores.
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 import java.io.FileNotFoundException;
 import java.io.File;
 
 public class PatternMatcher {
 
     public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
         String fileName, pattern;
         ArrayList<String> wordList;
 
         System.out.print("Enter a file name to search in : ");
         fileName = scnr.nextLine();
 
         try {
             wordList = getWordList(fileName);
 
         } catch (FileNotFoundException ex) {
             System.out.println("Error: File not found, exiting...");
             return;
         }
 
         System.out.println("File read successfully, initiating pattern matcher...");
 
         do {
             System.out.print("Enter a pattern to match (or press Enter to exit): ");
             pattern = scnr.nextLine();
 
             if (pattern.equals("")) break;
 
             ArrayList<String> matches = getMatches(wordList, pattern);
             System.out.println(matches);
         } while (pattern.length() > 0);
 
         scnr.close();
         System.out.print("Exiting...");
     }
 
     public static ArrayList<String> getWordList(String fileName) throws FileNotFoundException {
         // declare and instantiate a new ArrayList<String>
         ArrayList<String> wordList = new ArrayList<String>();
         // open the specified text file
         Scanner wordFile = new Scanner(new File(fileName));
         // read each word from file and add word to ArrayList
         while (wordFile.hasNext())
             wordList.add(wordFile.next());
         
         wordFile.close();
         // return to ArrayList
         return wordList;
     }
 
     public static boolean isMatchAtIndex(String word, String pattern, int index) {
         // is the index valid for both word and pattern?
         if (index >= word.length() || index >= pattern.length())
             return false;
         // if the char at index in pattern is an underscore, then it is always a match
         if (pattern.charAt(index) == '_')
             return true;
         // it's a match if the char at index in word is the same as the char at index in the pattern
         return word.charAt(index) == pattern.charAt(index);
     }
 
     public static boolean isMatch(String word, String pattern) {
         // are the word and the pattern the same length?
         if (word.length() != pattern.length())
             return false;
         // check for a mismatch at each index in word and pattern
         for (int index = 0; index < pattern.length(); index++)
             if (! isMatchAtIndex(word, pattern, index))
                 return false;
         // if no mismatches then pattern matches word
         return true;
     }
 
     public static ArrayList<String> getMatches(ArrayList<String> wordList, String pattern) {
         // create a new ArrayList
         ArrayList<String> wordsThatMatch = new ArrayList<String>();
         // find the words in the wordlist that match the pattern
         for (String word : wordList)
             if (isMatch(word, pattern))
                 wordsThatMatch.add(word);
         // return the list of matches
         return wordsThatMatch;
     }
 }
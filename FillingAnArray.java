/**
 * Write a description of class FillingAnArray here.
 *
 * @author (Ms. Schulze)
 * @version (1.0)
 */

import java.util.Scanner;

public class FillingAnArray
{
    // Initialize Booleans to allow repetition of tasks.
    public static boolean playAgain = true;
    public static boolean fillAnElement = true;
        
    // Initialize an array of length 5.
    public static int number = 5;
    public static String[] myStringArray = {"0", "1", "2", "3", "4"};
        
    // Create a variable for the user to choose a particular element.
    public static int elementNumber;
    
    // Initialize scanner.
    public static Scanner myScanner = new Scanner(System.in);
    
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    static void input1() {
        for (int i = 0; i < number; i++) {
            int count = i + 1;
            System.out.print("Give the value for the string in position " + count + ":  ");
            myStringArray[i] = myScanner.next();
        }
    }
    
    static void print1() {
        System.out.println("Here are the values in the array.");
        
        for (int i = 0; i < number; i++) {
            int numberPlusOne = i + 1;
            System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[i] + ".");
        }
    }
    
    static void change1() {
        while (fillAnElement) {
            System.out.print("Which element number would you like to replace?  Type 1 - 5.");
            elementNumber = myScanner.nextInt();
            int printNumber = elementNumber + 1; // Adds one to the index.
                
            System.out.print("Enter a new value for element " + elementNumber + ":  ");
            myStringArray[elementNumber - 1] = myScanner.next();
                
            System.out.print("Type true if you'd like to replace one or more elements in the array.  ");
            fillAnElement = myScanner.nextBoolean();
        }
    }
    
    public static void main(String[] args) {
       
        // The tasks of the program that the user can repeat through the boolean playAgain.
        do {
            clearScreen();

            System.out.println("There is an array with a place for five strings.");
            
            // Prompts user to input strings for the array.
            input1();
            
            // Uses for loop to print out the elements in the array.
            print1();
            
            // Prompts user for choice of changing the value of an element in the array.
            System.out.print("Type true if you'd like to replace one or more elements in the array.  ");
            fillAnElement = myScanner.nextBoolean();
            
            // Gives the user a chance to change an element value by prompting the element number placement and the string value.
            change1();
            
            // Prints the values in the array.
            print1();
            
            System.out.print("Would you like to start this process again!?  Type true or false:  ");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);  // Program loops while user enters true, ends when user enters false.
    }
}
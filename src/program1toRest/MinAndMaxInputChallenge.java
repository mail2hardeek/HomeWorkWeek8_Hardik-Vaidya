/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

package program1toRest;

import java.util.Scanner;

public class MinAndMaxInputChallenge {  //Class name
    public static void main(String[] args) { //Main method declared
        Scanner abc = new Scanner(System.in); // Scanner declared
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter a number: "); //Print Statement
            if (abc.hasNextInt()) {  //if condition
                int number = abc.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else { // else condition
                System.out.println("Invalid input"); // Print Statement
                break;  // Break
            }
        }
        System.out.println("Minimum number: " + min); // Print statement
        System.out.println("Maximum number: " + max); // Print Statement
    }
}

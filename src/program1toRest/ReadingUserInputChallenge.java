package program1toRest;
/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */

import java.util.Scanner;

public class ReadingUserInputChallenge { //Class name

    public static void main(String[] args) { //Main method declared
        Scanner abc = new Scanner(System.in); //Scanner declared
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count + ":"); //Print statement
            boolean validateNumber = abc.hasNextInt();
            if (validateNumber) {
                int number = abc.nextInt();
                sum += number;
                count++;

            } else {
                System.out.println("Invaild number");
                abc.next();
            }
        }
        System.out.println("The sum of the 10 number is: " + sum); //Print statement

        //Always return new userInput
    }
}

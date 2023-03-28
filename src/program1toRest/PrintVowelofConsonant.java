package program1toRest;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class PrintVowelofConsonant {            //CLass name
    public static void main(String[] args) { //main method
        Scanner abc = new Scanner(System.in); // Scanner
        System.out.println("Input a alphabet:  "); ////Print statement
        String input = abc.nextLine();
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) { //if condition applied
            System.out.println("Error: please enter a single letter from alphabet."); //Print statement


        } else { //else condition applied
            char letter = input.charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("Input letter is Vowel"); //Print statement
            } else {
                System.out.println("Input letter is Consonant"); //Print statement

            }
            abc.close(); //Scanner closed
        }

    }


}


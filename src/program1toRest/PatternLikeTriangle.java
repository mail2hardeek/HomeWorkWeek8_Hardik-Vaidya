package program1toRest;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class PatternLikeTriangle {// Class name

    public static void main(String[] args) { // Declared main method
        int i, x, n;
        System.out.print("Input number of rows :  "); //Print statement
        Scanner abc = new Scanner(System.in); // Scanner called
        n = abc.nextInt();
        for (i = 1; i <= n; i++) {
            for (x = 1; x <= i; x++)
                System.out.print(x); //Print statement
            System.out.println(""); //Print statement
        }
    }
}
package program1toRest;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class PatternLikeADiamond { //Class name

    public static void diamond(int r, char ch) {  //static method
        int i = 1;
        int j;
        while (i <= r) {   //While condition applied for loop
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" "); //Print statement
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch); //Print statement
            }
            System.out.println(); //Print statement
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" "); //Print statement
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch); //Print statement
            }
            System.out.println(); //Print statement
            i--;
        }
    }

    public static void main(String[] args) { // Main method
        Scanner abc = new Scanner(System.in); // Scanner declared
        System.out.println("Enter the Number of row : "); //Print statement
        int a = abc.nextInt();
        System.out.println("Enter the symbol : "); //Print statement
        char c = abc.next().charAt(0);
        diamond(a, c); // Obj called
        abc.close(); // Scanner closed

    }
}

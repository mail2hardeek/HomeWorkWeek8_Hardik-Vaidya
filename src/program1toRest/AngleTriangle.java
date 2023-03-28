package program1toRest;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class AngleTriangle { // Class name
    public static void triangle(int n) {  //Static method
        for (int s = 0; s <= n; s++) {
            for (int a = 0; a < s; a++) {
                System.out.print("@");
            }
            System.out.println(""); //print statement
        }

    }

    public static void main(String[] args) { //main method
        Scanner abc = new Scanner(System.in); //Scanner imported
        System.out.println("Input number of rows: "); // Print Statement
        triangle(abc.nextInt()); // Object calling
        abc.close(); // Scanner close
    }

}

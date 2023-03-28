package program1toRest;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class LeftAngleTriangle { // Class file
    public static void main(String[] args) { //Main method
        triangleleft();                  //Obj creation

    }

    public static void triangleleft() { //Static method
        int rows = 6;

        for (int x = 1; x <= rows; x++) {

            for (int i = 1; i <= x; i++) {
                System.out.print("* "); // Print statement
            }
            System.out.println(" "); // Print statement
        }

    }
}
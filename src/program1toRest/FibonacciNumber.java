package program1toRest;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciNumber {                                             //Class name
    public static void main(String[] args) {                              //Main method
        fibonacci();                                                      //static method calling
    }

    public static void fibonacci() {                                     //Static method
        int n = 10, firstTerm = 0, secondTerm = 1;                      //define veriables
        System.out.println("Fibonacci Serier till " + n + " terms");    //print statement
        for (int i = 1; i <= n; ++i) {                                  //Condition applied
            System.out.println(firstTerm + ",");      //print statement
            int nextTerm = firstTerm + secondTerm;  //integer defined to add first term number and second number
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}

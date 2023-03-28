package program1toRest;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class SharedDigit { // Class name
    public static boolean digit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int numberOneFirstDigit = num1 % 10; // check if num1 and num2 have a digit in common
        int numberTwoFirstDigit = num2 % 10;
        num1 /= 10;
        num2 /= 10;
        return (numberOneFirstDigit == num2 || numberOneFirstDigit == num1 || numberTwoFirstDigit == num1 || numberTwoFirstDigit == num2);
    }

    public static void main(String[] args) { // Main method declared
        System.out.println(digit(12, 23)); // true
        System.out.println(digit(9, 99)); // false
        System.out.println(digit(15, 55)); //true
    }
}